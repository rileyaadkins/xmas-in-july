export { createSingleArtistSection };
import { createSingleAlbumSection } from "./singleAlbumSection.js";
import { fetchSingleAlbum } from "../artistFetcher.js";


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
    albumLi.addEventListener("click", () => {
      renderSingleAlbum(mainSection, album.id);
    })    
    albumUl.appendChild(albumLi);
  });
  mainSection.appendChild(albumDiv);
  return mainSection;
};

const renderSingleAlbum = (element, albumId) => {
  while (element.firstChild) {
    element.firstChild.remove();
  }

  const link = document.createElement('link');  
  
        link.rel = "stylesheet";  
        link.type = "text/css"; 
        link.href = "./src/css/album-layout.css";  
   document.getElementsByTagName('HEAD')[0].appendChild(link);

   const link2 = document.createElement('link');  
  
        link2.rel = "stylesheet";  
        link2.type = "text/css"; 
        link2.href = "./src/css/album-style.css";  
   document.getElementsByTagName('HEAD')[0].appendChild(link2);

  const album = fetchSingleAlbum(albumId);
  createSingleAlbumSection(album, element);
};