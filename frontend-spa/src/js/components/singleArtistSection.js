export { createSingleArtistSection };
import { createSingleAlbumSection } from "./singleAlbumSection.js";
import { fetchSingleAlbum, postNewAlbum } from "../apiHelper.js";
import { renderSingleArtist } from "./allArtistsSection.js";

const createSingleArtistSection = (singleArtist, mainSection) => {
  const aside = document.createElement("aside");
  aside.classList.add("aside");
  aside.innerHTML = `
    <h1>${singleArtist.name}</h1>
          <div class="artist-pic" style="background-image: url(${singleArtist.imagePath})"></div>
          <span class="artist-birthday">${singleArtist.dob}</span>
    `;

  mainSection.prepend(aside);

  const albumDiv = document.createElement("div");
  albumDiv.classList.add("anything");
  albumDiv.innerHTML = "<h1>Albums</h1>";
  const albumUl = document.createElement("ul");
  albumUl.classList.add("album-list");
  albumDiv.appendChild(albumUl);
  singleArtist.albums.forEach((album) => {
    const albumLi = document.createElement("li");
    albumLi.innerHTML = `
    <span class="close">X</span>
        <div class="album-pic" style="background-image: url(${album.imagePath})"></div>
        <span class="album-name">${album.albumTitle}</span>`;
    albumLi.addEventListener("click", () => {
      renderSingleAlbum(mainSection, album.id);
    });
    albumUl.appendChild(albumLi);
  });
  const addAlbumLi = document.createElement("li");
  addAlbumLi.innerHTML = `<span class="close">X</span>
    <div class="album-pic">
      <span class="add-plus">+</span>
    </div>
    <span class="album-name">Add Album</span>`;

  const addAlbumForm = document.createElement("div");
  addAlbumForm.classList.add("add-album");

  const nameInput = document.createElement("input");
  nameInput.type = "text";
  nameInput.placeholder = "Album Name";
  nameInput.required;

  const releaseYear = document.createElement("input");
  releaseYear.type = "number";
  releaseYear.id = "record-year";
  releaseYear.placeholder = "YYYY";
  releaseYear.max = "2020";
  releaseYear.maxLength = "4";
  releaseYear.minLength = "4";
  releaseYear.min = "1900";
  releaseYear.required;

  const release_year_label = document.createElement("label");
  release_year_label.for = "record-year";
  release_year_label.innerText = "Year: ";

  const recordLabel = document.createElement("input");
  recordLabel.type = "text";
  recordLabel.placeholder = "Record Label";
  recordLabel.required;

  const albumImage = document.createElement("input");
  albumImage.type = "text";
  albumImage.placeholder = "Album Cover Image";
  albumImage.required;

  const submitButton = document.createElement("button");
  submitButton.innerText = "submit";

  submitButton.addEventListener("click", () => {
    const album = {
      releaseYear: releaseYear.value,
      albumTitle: nameInput.value,
      imagePath: albumImage.value,
      recordLabel: recordLabel.value,
    };
    postNewAlbum(singleArtist.id, album).then((artist) => {
      renderSingleArtist(mainSection, artist.id);
    });
  });
  addAlbumForm.append(
    nameInput,
    release_year_label,
    releaseYear,
    recordLabel,
    albumImage,
    submitButton
  );
  addAlbumLi.append(addAlbumForm);
  mainSection.appendChild(albumDiv);
  albumUl.appendChild(addAlbumLi);
  return mainSection;
};

const renderSingleAlbum = (element, albumId) => {
  while (element.firstChild) {
    element.firstChild.remove();
  }

  const link = document.createElement("link");

  link.rel = "stylesheet";
  link.type = "text/css";
  link.href = "./src/css/album-layout.css";

  document.getElementsByTagName("HEAD")[0].appendChild(link);
  document.getElementById("artist-layout").disabled = true;

  const link2 = document.createElement("link");

  link2.rel = "stylesheet";
  link2.type = "text/css";
  link2.href = "./src/css/album-style.css";
  document.getElementsByTagName("HEAD")[0].appendChild(link2);
  document.getElementById("artist-style").disabled = true;
  fetchSingleAlbum(albumId).then((album) => {
    console.log(album);
    createSingleAlbumSection(album, element);
  });
};
