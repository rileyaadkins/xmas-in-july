import { fetchArtists, fetchSingleArtist } from "../apiHelper.js";
import {
  createSingleArtistSection,
  renderSingleAlbum,
} from "./singleArtistSection.js";

export const createRandomizerSection = (mainSection) => {
  const randomArtistSection = document.createElement("section");
  randomArtistSection.classList.add("random-artist");
  const titleH1 = document.createElement("h1");
  titleH1.innerText = "Artist Spotlight";
  const artistImgDiv = document.createElement("div");
  artistImgDiv.classList.add("artist-img");
  const artistNameSpan = document.createElement("span");
  artistNameSpan.id = "artist-name";
  artistNameSpan.classList.add("artist-name");
  const albumImgDiv = document.createElement("div");
  albumImgDiv.classList.add("album-img");

  randomArtistSection.append(
    titleH1,
    artistImgDiv,
    artistNameSpan,
    albumImgDiv
  );
  mainSection.append(randomArtistSection);

  fetchArtists().then((artists) => {
    let x = Math.max(Math.round(Math.random() * artists.length - 1), 0);
    let randomArtist = artists[x];

    let y = Math.max(
      Math.round(Math.random() * randomArtist.albums.length - 1),
      0
    );
    let randomAlbum = randomArtist.albums[y];

    artistNameSpan.innerHTML = randomArtist.name;
    artistImgDiv.style.backgroundImage = "url(" + randomArtist.imagePath + ")";
    albumImgDiv.style.backgroundImage = "url(" + randomAlbum.imagePath + ")";
    artistImgDiv.addEventListener("click", () => {
      renderSpotlightArtist(mainSection, randomArtist.id);
    });
    albumImgDiv.addEventListener("click", () => {
      renderSingleAlbum(mainSection, randomAlbum.id);
    });
  });

  return mainSection;
};

const renderSpotlightArtist = (element, artistId) => {
  while (element.firstChild) {
    element.firstChild.remove();
  }

  document.getElementById("artist-layout").disabled = false;
  document.getElementById("artist-style").disabled = false;

  fetchSingleArtist(artistId).then((artist) => {
    createSingleArtistSection(artist, element);
  });
};
