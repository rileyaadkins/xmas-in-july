export { createAllArtistsSection, renderSingleArtist };
import { createSingleArtistSection } from "./singleArtistSection.js";
import {
  fetchSingleArtist,
  postNewArtist,
  deleteArtist,
} from "../apiHelper.js";
import { renderPage } from "../app.js";
// import { redirectSwitch, randomArtistID, randomAlbum } from "../randomizer.js";

const createAllArtistsSection = (allArtists) => {
  const mainSection = document.createElement("main");
  mainSection.innerHTML = `<h1>Artists</h1>`;

  const artistsUl = document.createElement("ul");
  artistsUl.classList.add("artist-list");

  allArtists.forEach((artist) => {
    const artistLi = document.createElement("li");

    const artistCloseSpan = document.createElement("span");
    artistCloseSpan.classList.add("close");
    artistCloseSpan.innerText = "X";

    const artistPicDiv = document.createElement("div");
    artistPicDiv.classList.add("artist-pic");
    artistPicDiv.style.backgroundImage = `url(${artist.imagePath})`;

    const artistNameSpan = document.createElement("span");
    artistNameSpan.classList.add("artist-name");
    artistNameSpan.innerHTML = `${artist.name}`;

    artistLi.append(artistCloseSpan, artistPicDiv, artistNameSpan);

    artistCloseSpan.addEventListener("click", () => {
      deleteArtist(artist.id).then((artists) => {
        renderPage(artists);
      });
    });

    artistPicDiv.addEventListener("click", () => {
      renderSingleArtist(mainSection, artist.id);
    });

    artistNameSpan.addEventListener("click", () => {
      renderSingleArtist(mainSection, artist.id);
    });

    artistsUl.appendChild(artistLi);

    // if (redirectSwitch === "artist") {
    //   setTimeout(() => {
    //     renderSingleArtist(mainSection, randomArtistID);
    //   }, 200);
    //   setTimeout(() => {
    //     redirectSwitch = "off";
    //   }, 200);
    // }
  });

  const addArtistLi = document.createElement("li");
  addArtistLi.innerHTML = `
  <span class="close">X</span>
  <div class="plus-sign"><span class="add-plus">+</span></div>
  <span class="artist-name">Add Artist</span> `;
  const artistForm = document.createElement("div");
  artistForm.classList.add("add-artist");
  const nameInput = document.createElement("input");
  nameInput.type = "text";
  nameInput.placeholder = "Artist Name";
  nameInput.required;
  artistForm.append(nameInput);
  const dobInput = document.createElement("input");
  dobInput.type = "text";
  dobInput.placeholder = "Date of Birth";
  dobInput.required;
  artistForm.append(dobInput);

  const artistImage = document.createElement("input");
  artistImage.type = "text";
  artistImage.placeholder = "Artist Image";
  artistImage.required;
  artistForm.append(artistImage);
  const submitButton = document.createElement("button");
  submitButton.innerText = "submit";
  artistForm.appendChild(submitButton);
  submitButton.addEventListener("click", () => {
    const artist = {
      name: nameInput.value,
      imagePath: artistImage.value,
      dob: dobInput.value,
    };
    postNewArtist(artist).then((artist) => {
      renderSingleArtist(mainSection, artist.id);
    });
  });
  addArtistLi.appendChild(artistForm);
  artistsUl.appendChild(addArtistLi);

  mainSection.appendChild(artistsUl);
  return mainSection;
};

const renderSingleArtist = (element, artistId) => {
  while (element.firstChild) {
    element.firstChild.remove();
  }

  document.getElementById("artist-layout").disabled = false;
  document.getElementById("artist-style").disabled = false;

  fetchSingleArtist(artistId).then((artist) => {
    console.log(artist);
    createSingleArtistSection(artist, element);
  });
};
