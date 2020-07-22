import { createFooter } from "./components/footer.js";
import { createHeader } from "./components/header.js";
import { createRandomizerSection } from "./components/randomizer.js";

export const renderPage = () => {
  const container = document.querySelector(".container");
  while (container.firstChild) {
    container.firstChild.remove();
  }
  container.prepend(createHeader());
  container.appendChild(createRandomizerSection());
  container.appendChild(createFooter());
  document.querySelector("#artist-layout").disabled = true;
};

renderPage();


