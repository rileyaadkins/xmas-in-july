export { createAllArtistsSection, renderSingleArtist };
import { createSingleArtistSection } from "./singleArtistSection.js";
import { fetchSingleArtist, postNewArtist } from "../apiHelper.js";

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
