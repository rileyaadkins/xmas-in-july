import {
  fetchSingleSong,
  fetchSongAlbum,
  fetchSongArtist,
} from "../apiHelper.js";

export { createSingleSongSection };

const createSingleSongSection = (song, mainSection) => {
  fetchSongAlbum(song.id).then((album) => {
    fetchSongArtist(song.id).then((artist) => {
      const aside = document.createElement("aside");
      aside.classList.add("aside");
      aside.innerHTML = ` <h2>${album.albumTitle}</h2>
        <div class="album-art" style="background-image: url(${album.imagePath})"></div>
        <h3>${artist.name}</h3>
        <span>${song.songName}</span>
        <span>${song.songLength}</span>`;

      mainSection.append(aside);

      const videoDiv = document.createElement("div");
      videoDiv.classList.add("anything");
      videoDiv.innerHTML = `<div class="video">
      <iframe
        src="${song.songUrl}"
        frameborder="0"
        allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
        allowfullscreen
      ></iframe></div>`;
      mainSection.append(videoDiv);
    });
  });
};
