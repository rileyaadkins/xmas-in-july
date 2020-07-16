export { createSingleAlbumSection };

const createSingleAlbumSection = (singleAlbum, mainSection) => {
  const section = document.createElement("section");
  section.classList.add("album");
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
    songLi.innerHTML = `<span class="close">X</span> ${song.songName}`;
    songListOl.appendChild(songLi);
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
};
