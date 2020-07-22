export {
  fetchArtists,
  fetchSingleArtist,
  fetchSingleAlbum,
  fetchSingleSong,
  fetchAlbumArtist,
  fetchSongAlbum,
  fetchSongArtist,
  postNewArtist,
  postNewAlbum,
  postNewSong,
  deleteSong,
  deleteAlbum,
  deleteArtist
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
  return fetch(`http://localhost:8080/api/artists`, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(artist),
  }).then((response) => response.json());
};

const postNewAlbum = async (artistId, album) => {
  return fetch(`http://localhost:8080/api/artists/${artistId}/album`, {
    method: "PATCH",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(album),
  }).then((response) => response.json());
};

const postNewSong = async (albumId, song) => {
  return fetch(`http://localhost:8080/api/albums/${albumId}/song`, {
    method: "PATCH",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(song),
  }).then((response) => response.json());
};

const deleteSong = async (songId) => {
  return fetch(`http://localhost:8080/api/song/${songId}`, {
    method: "DELETE",
  }).then((response) => response.json());
};

const deleteAlbum = async (albumId) => {
  return fetch(`http://localhost:8080/api/albums/${albumId}`, {
    method: "DELETE",
  }).then((response) => response.json());
};

const deleteArtist = async (artistId) => {
  return fetch(`http://localhost:8080/api/artists/${artistId}`, {
    method: "DELETE",
}).then((response) => response.json());
};
