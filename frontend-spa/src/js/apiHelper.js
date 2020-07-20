export {
  fetchArtists,
  fetchSingleArtist,
  fetchSingleAlbum,
  fetchSingleSong,
  fetchAlbumArtist,
  fetchSongAlbum,
  fetchSongArtist,
};

const fetchArtists = async () => {
  return fetch("http://localhost:8080/api/artists").then((response) =>
    response.json()
  );
};
const fetchSingleArtist = (artistId) => {
  return fetch(
    `http://localhost:8080/api/artists/${artistId}`
  ).then((response) => response.json());
};

const fetchSingleAlbum = (albumId) => {
  return fetch(`http://localhost:8080/api/albums/${albumId}`).then((response) =>
    response.json()
  );
};

const fetchSingleSong = (songId) => {
  return fetch(`http://localhost:8080/api/song/${songId}`).then((response) =>
    response.json()
  );
};

const fetchAlbumArtist = (albumId) => {
  return fetch(
    `http://localhost:8080/api/albums/${albumId}/artist`
  ).then((response) => response.json());
};

const fetchSongAlbum = (songId) => {
  return fetch(
    `http://localhost:8080/api/song/${songId}/album`
  ).then((response) => response.json());
};

const fetchSongArtist = (songId) => {
  return fetch(
    `http://localhost:8080/api/song/${songId}/artist`
  ).then((response) => response.json());
};

const postNewArtist = async (artist) => {
  return fetch(
    `http://localhost:8080/api/artists`, {
     method: "POST", 
     headers:{
       "Content-Type"
     }    }
  )
};
