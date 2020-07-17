export { createSingleAlbumSection };
import {
  fetchSingleAlbum,
  fetchAlbumArtist,
  fetchSingleSong,
} from "../apiHelper.js";
import { createSingleSongSection } from "./singleSongSection.js";

const createSingleAlbumSection = (singleAlbum, mainSection) => {
  fetchAlbumArtist(singleAlbum.id).then((albumArtist) => {
    const section = document.createElement("section");
    section.classList.add("album");
    section.innerHTML = `  <h1>${singleAlbum.albumTitle}</h1>
    <div class="album-img" style="background-image: url(${singleAlbum.imagePath})"></div>
    <ul>
      <li>Artist: <span>${albumArtist.name}</span></li>
      <li>Release year: <span>${singleAlbum.releaseYear}</span></li>
      <li>Record label: <span>${albumArtist.recordLabel}</span></li>
    </ul>`;
    mainSection.prepend(section);
    const songListDiv = document.createElement("div");
    songListDiv.classList.add("songlist-container");
    const songListOl = document.createElement("ol");
    songListOl.classList.add("album-songlist");
    singleAlbum.songList.forEach((song) => {
      const songLi = document.createElement("li");
      songLi.innerHTML = `<span class="close">X</span> ${song.songName}`;
      songListOl.appendChild(songLi);
      songLi.addEventListener("click", () => {
        renderSingleSong(mainSection, song.id);
      });
    });
    const addSongForm = document.createElement("div");
    addSongForm.classList.add("add-song");
    addSongForm.innerHTML = `+ 
  <div class="form-container">
  <form>
    <input type="text" name="song-name" id="song-name" placeholder="Song Name" required />
    <label for="song-duration">Duration: </label>
    <input type="text" name="song-duration" id="song-duration" placeholder="0:00" required />
  <button>Submit</button>
  </form>
  </div>`;
    songListDiv.appendChild(songListOl);
    songListDiv.appendChild(addSongForm);
    section.appendChild(songListDiv);
    return mainSection;
  });
};

const renderSingleSong = (element, songId) => {
  while (element.firstChild) {
    element.firstChild.remove();
  }

  const link = document.createElement("link");

  link.rel = "stylesheet";
  link.type = "text/css";
  link.href = "./src/css/song-layout.css";

  document.getElementsByTagName("HEAD")[0].appendChild(link);

  const link2 = document.createElement("link");

  link2.rel = "stylesheet";
  link2.type = "text/css";
  link2.href = "./src/css/song-style.css";
  document.getElementsByTagName("HEAD")[0].appendChild(link2);
  fetchSingleSong(songId).then((song) => {
    console.log(song);
    createSingleSongSection(song, element);
  });
};
