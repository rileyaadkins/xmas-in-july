import { fetchArtists } from "./apiHelper.js";
import { createAllArtistsSection } from "./components/allArtistsSection.js";
export { renderAllArtists };

const renderAllArtists = (mainSection) => {
  while (mainSection.firstChild) {
    mainSection.firstChild.remove();
  }
  fetchArtists().then((artists) => {
    createAllArtistsSection(mainSection, artists);
  });
  document.querySelector("#artist-layout").disabled = true;
  document.querySelector("#artist-style").disabled = true;
  document.querySelector("#album-layout").disabled = true;
  document.querySelector("#album-style").disabled = true;
  document.querySelector("#song-layout").disabled = true;
  document.querySelector("#song-style").disabled = true;
};
