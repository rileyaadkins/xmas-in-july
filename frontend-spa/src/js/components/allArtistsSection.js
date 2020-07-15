export { createAllArtistsSection };

const createAllArtistsSection = (allArtists) => {
  const mainSection = document.createElement("main");
  mainSection.innerHTML = `<h1>Artists</h1>`;
  const artistsUl = document.createElement("ul");
  artistsUl.classList.add("artist-list");
  allArtists.forEach((artist) => {
    const artistLi = document.createElement("li");
    artistLi.innerHTML = `
    <div class="artist-pic" style="background-image: url(${artist.imagePath})"></div>
    <span class="artist-name">${artist.name}</span>`;
    artistsUl.appendChild(artistLi);
  });
  mainSection.appendChild(artistsUl);
  return mainSection;
};
