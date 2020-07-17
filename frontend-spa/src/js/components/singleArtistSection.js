export { createSingleArtistSection };
import { createSingleAlbumSection } from "./singleAlbumSection.js";
import { fetchSingleArtist } from "../apiHelper.js";

const createSingleArtistSection = (artistId, mainSection) => {
  const singleArtist = fetchSingleArtist(artistId);
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
    <span class="album-name">Add Album</span>
    <div class="add-album">
      <form action="">
        <input
          class="test"
          type="text"
          name="album-name"
          id="album-name"
          placeholder="Album Name"
          required
        />
        <label for="record-year">Year: </label>
        <input
          type="number"
          name="record-year"
          id="record-year"
          placeholder="YYYY"
          max="2020"
          maxlength="4"
          minlength="4"
          min="1900"
          required
        />
        <input
          type="text"
          name="record-label"
          id="record-label"
          placeholder="Record Label"
          required
        />
        <button>Submit</button>
      </form>
    </div>`;

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

  
  createSingleAlbumSection(albumId, element);
};
