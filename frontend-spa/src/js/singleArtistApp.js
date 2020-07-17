import { fetchArtists, fetchSingleArtist } from "./apiHelper.js";
import { createFooter } from "./components/footer.js";
import { createHeader } from "./components/header.js";
import { createSingleArtistSection } from "./components/singleArtistSection.js";

const renderPage = (singleArtist) => {
  const container = document.querySelector(".container");
  while (container.firstChild) {
    container.firstChild.remove();
  }
  container.prepend(createHeader());
  container.appendChild(createSingleArtistSection(singleArtist));
  container.appendChild(createFooter());
};

const singleArtist = fetchSingleArtist(1);
renderPage(singleArtist);
