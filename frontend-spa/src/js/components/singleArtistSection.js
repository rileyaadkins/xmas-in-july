export { createSingleArtistSection };

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
        <div class="album-pic" style="background-image: url(${album.imagePath})"></div>
        <span class="album-name">${album.albumTitle}</span>`;
    albumUl.appendChild(albumLi);
  });
  mainSection.appendChild(albumDiv);
  return mainSection;
};