import { fetchArtists } from "./apiHelper.js";

const nameDiv = document.querySelector(".artist-name");
const artistImg = document.querySelector(".artist-img");
const albumImg = document.querySelector(".album-img");
const artistLink = document.querySelector(".artist-link");
const albumLink = document.querySelector(".album-link");

fetchArtists().then((artists) => {
  let x = Math.max(Math.round(Math.random() * artists.length - 1), 0);
  let randomArtist = artists[x];

  let y = Math.max(
    Math.round(Math.random() * randomArtist.albums.length - 1),
    0
  );
  let randomAlbum = randomArtist.albums[y];

  nameDiv.innerHTML = randomArtist.name;
  artistImg.style.backgroundImage = "url(" + randomArtist.imagePath + ")";
  albumImg.style.backgroundImage = "url(" + randomAlbum.imagePath + ")";
  artistLink.href = "./artists.html";
  albumLink.href = "./artists.html";
});

nameDiv.style.fontSize = "40pt";
nameDiv.style.fontFamily = "Poppins, cursive";

nameDiv.addEventListener("mouseover", () => {
  nameDiv.style.fontWeight = "bolder";
  nameDiv.style.textShadow = "0 -3px 3px aliceblue";
});

nameDiv.addEventListener("mouseout", () => {
  nameDiv.style.fontWeight = "normal";
  nameDiv.style.textShadow = "none";
});

artistImg.style.height = "200px";
artistImg.style.width = "200px";
artistImg.style.margin = "20px auto 0 auto";
artistImg.style.backgroundSize = "cover";
artistImg.style.borderRadius = "50%";

artistImg.addEventListener("mouseover", () => {
  artistImg.style.transform = "scale(1.1)";
  artistImg.style.filter = "grayscale(0.7)";
});

artistImg.addEventListener("mouseout", () => {
  artistImg.style.transform = "scale(1.0)";
  artistImg.style.filter = "grayscale(0)";
});

albumImg.style.height = "400px";
albumImg.style.width = "400px";
albumImg.style.margin = "0 auto";
albumImg.style.backgroundSize = "cover";
albumImg.style.borderRadius = "20px";
