export { createAllArtistsSection };
import { createSingleArtistSection } from "./singleArtistSection.js";
import { fetchSingleArtist } from "../artistFetcher.js";

const createAllArtistsSection = (allArtists) => {
  const mainSection = document.createElement("main");
  mainSection.innerHTML = `<h1>Artists</h1>`;

  const artistsUl = document.createElement("ul");
  artistsUl.classList.add("artist-list");

  allArtists.forEach((artist) => {
    const artistLi = document.createElement("li");
    artistLi.innerHTML = `
    <span class="close">X</span>
    <div class="artist-pic" style="background-image: url(${artist.imagePath})"></div>
    <span class="artist-name">${artist.name}</span>`;
    artistLi.addEventListener("click", () => {
      renderSingleArtist(mainSection, artist.id);
    });
    artistsUl.appendChild(artistLi);
  });

  const addArtistLi = document.createElement("li");
  addArtistLi.innerHTML = `
  <span class="close">X</span>
  <div class="plus-sign"><span class="add-plus">+</span></div>
  <span class="artist-name">Add Artist</span>
  <div class="add-artist">
   <form action="">
   <input type="text" name="artist-name" id="artist-name" placeholder="Artist Name" required />
   <button>Submit</button>
  </form></div>
  `;

  artistsUl.appendChild(addArtistLi);

  mainSection.appendChild(artistsUl);
  return mainSection;
};

const renderSingleArtist = (element, artistId) => {
  while (element.firstChild) {
    element.firstChild.remove();
  }

  const artist = fetchSingleArtist(artistId);
  createSingleArtistSection(artist, element);
};
