export { createAllArtistsSection };

const createAllArtistsSection = (allArtists) => {
  const mainSection = document.createElement("main");
  mainSection.innerHTML = `<h1>Artists</h1><ul class="artist-list">`;
  allArtists.forEach((artist) => {
    mainSection.innerHTML += `
    <li>
    <div class="artist-pic" style="background-image: url(${artist.imagePath});"></div>
    <span class="artist-name">${artist.name}</span>
    </li>`;
  });
  mainSection.innerHTML += `</ul>`;
  return mainSection;
};
