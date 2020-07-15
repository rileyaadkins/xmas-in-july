export { createSingleAlbumSection };

const createSingleAlbumSection = (singleAlbum) => {
  const mainSection = document.createElement("main");
  const section = document.createElement("section");
  section.classList.add("section");
  section.innerHTML = `  <h1>${singleAlbum.albumTitle}</h1>
    <div class="album-img" style="background-image: url(${singleAlbum.imagePath})"></div>
    <ul>
      <li>Artist: <span>Artist Name</span></li>
      <li>Release year: <span>Release Year</span></li>
      <li>Record label: <span>Record Label</span></li>
    </ul>`;

  mainSection.prepend(section);
  const songListDiv = document.createElement("div");
  songListDiv.classList.add("songlist-container");
  const songListOl = document.createElement("ol");
  songListOl.classList.add("album-songlist");
  singleAlbum.songList.forEach((song) => {
    const songLi = document.createElement("li");
    songLi.innerHTML = `${song.songName}`;
    songListOl.appendChild(songLi);
  });

  songListDiv.appendChild(songListOl);
  mainSection.appendChild(songListDiv);
  return mainSection;
};
