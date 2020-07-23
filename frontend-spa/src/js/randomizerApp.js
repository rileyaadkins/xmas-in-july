import { createFooter } from "./components/footer.js";
import { createHeader } from "./components/header.js";
import { createRandomizerSection } from "./components/randomizer.js";

export const renderPage = () => {
  const container = document.querySelector(".container");
  while (container.firstChild) {
    container.firstChild.remove();
  }
  const mainSection = document.createElement("main");
  container.prepend(createHeader(mainSection));
  container.appendChild(createRandomizerSection(mainSection));
  container.appendChild(createFooter());
  document.querySelector("#artist-layout").disabled = true;
  document.querySelector("#artist-style").disabled = true;
  document.querySelector("#album-layout").disabled = true;
  document.querySelector("#album-style").disabled = true;
  document.querySelector("#song-layout").disabled = true;
  document.querySelector("#song-style").disabled = true;
};

renderPage();
