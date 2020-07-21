export { createSingleAlbumSection };
import {
  fetchAlbumArtist,
  fetchSingleSong,
  postNewSong,
  deleteSong,
} from "../apiHelper.js";
import { createSingleSongSection } from "./singleSongSection.js";
import { renderSingleAlbum } from "./singleArtistSection.js";

const createSingleAlbumSection = (singleAlbum, mainSection) => {
  fetchAlbumArtist(singleAlbum.id).then((albumArtist) => {
    const section = document.createElement("section");
    section.classList.add("album");
    section.innerHTML = `  <h1>${singleAlbum.albumTitle}</h1>
    <div class="album-img" style="background-image: url(${singleAlbum.imagePath})"></div>
    <ul>
      <li>Artist: <span>${albumArtist.name}</span></li>
      <li>Release year: <span>${singleAlbum.releaseYear}</span></li>
      <li>Record label: <span>${singleAlbum.recordLabel}</span></li>
    </ul>`;
    mainSection.prepend(section);
    const songListDiv = document.createElement("div");
    songListDiv.classList.add("songlist-container");
    const songListOl = document.createElement("ol");
    songListOl.classList.add("album-songlist");
    singleAlbum.songList.forEach((song) => {
      const songLi = document.createElement("li");
      const songNameSpan = document.createElement("span");
      songNameSpan.innerHTML = ` ${song.songName}`;
      songLi.append(songNameSpan);
      const closeButton = document.createElement("span");
      closeButton.classList.add("close");
      closeButton.innerText = "X";

      closeButton.addEventListener("click", () => {
        deleteSong(song.id).then((album) => {
          renderSingleAlbum(mainSection, album.id);
        });
      });

      songLi.prepend(closeButton);
      songListOl.appendChild(songLi);
      songNameSpan.addEventListener("click", () => {
        renderSingleSong(mainSection, song.id);
      });
    });
    const addSongForm = document.createElement("div");
    addSongForm.classList.add("add-song");

    addSongForm.innerHTML = "+";

    const addSongDiv = document.createElement("div");
    addSongDiv.classList.add("form-container");
    const songName = document.createElement("input");
    songName.type = "text";
    songName.placeholder = "Song Name";
    songName.required;

    const videoUrl = document.createElement("input");
    videoUrl.type = "text";
    videoUrl.placeholder = "Youtube Link";
    videoUrl.required;

    const durationLabel = document.createElement("label");
    durationLabel.for = "song-duration";
    durationLabel.innerText = "Duration: ";

    const durationInput = document.createElement("input");
    durationInput.type = "text";
    durationInput.id = "song-duration";
    durationInput.placeholder = "0:00";
    durationInput.required;

    const submitButton = document.createElement("button");
    submitButton.innerText = "Submit";

    submitButton.addEventListener("click", () => {
      const song = {
        songName: songName.value,
        songLength: durationInput.value,
        songUrl: videoUrl.value,
      };
      postNewSong(singleAlbum.id, song).then((album) => {
        renderSingleAlbum(mainSection, album.id);
      });
    });

    addSongDiv.append(
      songName,
      videoUrl,
      durationLabel,
      durationInput,
      submitButton
    );

    addSongForm.append(addSongDiv);
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

  document.getElementById("song-layout").disabled = false;
  document.getElementById("song-style").disabled = false;

  fetchSingleSong(songId).then((song) => {
    console.log(song);
    createSingleSongSection(song, element);
  });
};
