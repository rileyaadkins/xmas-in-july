import { createFooter } from "./components/footer.js";
import { createHeader } from "./components/header.js";
import { fetchSingleAlbum } from "./artistFetcher.js";
import { createSingleAlbumSection } from "./components/singleAlbumSection.js";

const renderPage = (singleAlbum) => {
    const container = document.querySelector(".container");
    while (container.firstChild){
        container.firstChild.remove();
    }
    container.prepend(createHeader());
    container.appendChild(createSingleAlbumSection(singleAlbum));
    container.appendChild(createFooter());
};

const singleAlbum = fetchSingleAlbum(1);
renderPage(singleAlbum);
