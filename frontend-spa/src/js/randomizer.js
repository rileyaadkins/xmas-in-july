import { fetchArtists } from "./apiHelper.js";
// export { redirectSwitch, randomArtistID, randomAlbum };

const nameDiv = document.querySelector("#artist-name");
const artistImg = document.querySelector(".artist-img");
const albumImg = document.querySelector(".album-img");
const artistLink = document.querySelector(".artist-link");
const albumLink = document.querySelector(".album-link");
// let redirectSwitch = "artist";
let randomAlbum;
let randomArtist;
// let randomArtistID;

fetchArtists().then((artists) => {
  let x = Math.max(Math.round(Math.random() * artists.length - 1), 0);
  randomArtist = artists[x];
  // randomArtistID = randomArtist.id;

  let y = Math.max(
    Math.round(Math.random() * randomArtist.albums.length - 1),
    0
  );
  randomAlbum = randomArtist.albums[y];

  nameDiv.innerHTML = randomArtist.name;
  artistImg.style.backgroundImage = "url(" + randomArtist.imagePath + ")";
  albumImg.style.backgroundImage = "url(" + randomAlbum.imagePath + ")";
  artistLink.addEventListener("click", () => {
    // redirectSwitch = "artist";
    setTimeout(()=>{
      location.href = "./artists.html";
    }, 200);
  });
  albumLink.addEventListener("click", () => {
    // redirectSwitch = "album";
    location.href = "./artists.html";
  });
});

