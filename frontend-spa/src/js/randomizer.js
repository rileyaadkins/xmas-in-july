const nameDiv = document.querySelector(".artist-name");
const artistImg = document.querySelector(".artist-img");
const albumImg = document.querySelector(".album-img");
const artistLink = document.querySelector(".artist-link");
const albumLink = document.querySelector(".album-link");

let artists = [];

function Artist(name, imgSrc, album, artLink, albLink) {
  this.name = name;
  this.imgSrc = imgSrc;
  this.album = album;
  this.artLink = artLink;
  this.albLink = albLink;
}

const mc = "Mariah Carey";
const mcImg = "./images/MC.jpeg";
const mcAlbumImg = "./images/MC-cover.png";
const mcArtistLink = "./artist.html";
const mcAlbumLink = "#";
const w = "Wham!";
const wImg = "./images/wham!.png";
const wAlbumImg = "./images/Last-Christmas-Wham.png";
const wArtistLink = "#";
const wAlbumLink = "#";
const ns = "NSYNC";
const nsImg = "./images/nsync.jpg";
const nsAlbumImg = "./images/Home_for_Christmas_nsync.png";
const nsArtistLink = "#";
const nsAlbumLink = "#";
const mb = "Michael Buble";
const mbImg = "./images/MB.png";
const mbAlbumImg = "./images/Christmas-Buble.png";
const mbArtistLink = "#";
const mbAlbumLink = "#";
const kb = "Kidz Bop";
const kbImg = "./images/kidsbop.png";
const kbAlbumImg = "./images/Kidz-Bob-Christmas.png";
const kbArtistLink = "#";
const kbAlbumLink = "#";

function addArtists() {
  artists.push(new Artist(mc, mcImg, mcAlbumImg, mcArtistLink, mcAlbumLink));
  artists.push(new Artist(w, wImg, wAlbumImg, wArtistLink, wAlbumLink));
  artists.push(new Artist(ns, nsImg, nsAlbumImg, nsArtistLink, nsAlbumLink));
  artists.push(new Artist(mb, mbImg, mbAlbumImg, mbArtistLink, mbAlbumLink));
  artists.push(new Artist(kb, kbImg, kbAlbumImg, kbArtistLink, kbAlbumLink));
}

addArtists();

let x = Math.max(Math.round(Math.random() * artists.length - 1), 0);
let randomArtist = artists[x];

nameDiv.innerHTML = randomArtist.name;
nameDiv.style.fontSize = "40pt";
nameDiv.style.fontFamily = "cursive";

nameDiv.addEventListener("mouseover",()=>{
  nameDiv.style.fontWeight = "bolder";
  nameDiv.style.textShadow = "0 -3px 3px aliceblue";
})

nameDiv.addEventListener("mouseout",()=>{
  nameDiv.style.fontWeight = "normal";
  nameDiv.style.textShadow = "none";
})

artistImg.style.backgroundImage = "url("+randomArtist.imgSrc+")";
artistImg.style.height = "200px";
artistImg.style.width = "200px";
artistImg.style.margin = "0 auto";
artistImg.style.backgroundSize = "cover";
artistImg.style.borderRadius = "50%";

artistImg.addEventListener("mouseover",()=>{
  artistImg.style.transform = "scale(1.1)";
  artistImg.style.filter = "grayscale(0.7)";
})

artistImg.addEventListener("mouseout",()=>{
  artistImg.style.transform = "scale(1.0)";
  artistImg.style.filter = "grayscale(0)";
})

albumImg.style.backgroundImage = "url("+randomArtist.album+")";
albumImg.style.height = "400px";
albumImg.style.width = "400px";
albumImg.style.margin = "0 auto";
albumImg.style.backgroundSize = "cover";
albumImg.style.borderRadius = "20px";

artistLink.href = randomArtist.artLink;
albumLink.href = randomArtist.albLink;