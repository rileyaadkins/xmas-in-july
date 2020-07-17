import { fetchArtists, fetchSingleArtist } from "./apiHelper.js";
import { createFooter } from "./components/footer.js";
import { createHeader } from "./components/header.js";
import { createAllArtistsSection } from "./components/allArtistsSection.js";

const renderPage = (allArtists) => {
  const container = document.querySelector(".container");
  while (container.firstChild) {
    container.firstChild.remove();
  }
  container.prepend(createHeader());
  container.appendChild(createAllArtistsSection(allArtists));
  container.appendChild(createFooter());
};

fetchArtists().then((artists) => {
  console.log(artists);
  renderPage(artists);
});
