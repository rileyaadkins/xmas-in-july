export { createHeader };
import { renderPage } from "../randomizerApp.js";
import { renderAllArtists } from "../app.js";

const createHeader = (mainSection) => {
  const header = document.createElement("header");
  header.innerHTML = `
        <h1>
          Ali's Page <br />
          <div class="header-image"></div>
        </h1>
  `;
  const navSection = document.createElement("nav");
  header.append(navSection);
  const navListUl = document.createElement("ul");
  navListUl.classList.add("nav-list");
  navSection.append(navListUl);

  const homeLi = document.createElement("li");
  homeLi.innerText = "Home";
  homeLi.addEventListener("click", () => {
    renderPage();
  });
  const artistsLi = document.createElement("li");
  artistsLi.innerText = "Artists";
  artistsLi.addEventListener("click", () => {
    renderAllArtists(mainSection);
  });
  navListUl.append(homeLi, artistsLi);
  return header;
};
