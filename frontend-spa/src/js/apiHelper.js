export {
  fetchArtists,
  fetchSingleArtist,
  fetchSingleAlbum,
  fetchSingleSong,
  fetchAlbumArtist,
  fetchSongAlbum,
  fetchSongArtist,
};

const fetchArtists = () => {
  return [
    {
      id: 1,
      albums: [
        {
          id: 4,
          albumTitle: "Merry Christmas",
          imagePath: "",
          songList: [
            {
              id: 8,
              songName: "Silent Night",
              songLength: "3:39",
            },
            {
              id: 9,
              songName: "All I Want for Christmas Is You",
              songLength: "4:01",
            },
            {
              id: 10,
              songName: "O Holy Night",
              songLength: "4:27",
            },
            {
              id: 11,
              songName: "Christmas (Baby Please Come Home)",
              songLength: "2:33",
            },
            {
              id: 12,
              songName: "Miss You Most (At Christmas Time)",
              songLength: "4:32",
            },
            {
              id: 13,
              songName: "Joy To The World",
              songLength: "4:18",
            },
            {
              id: 14,
              songName: "Jesus Born on This Day",
              songLength: "3:41",
            },
            {
              id: 15,
              songName: "Santa Claus is Coming To Town",
              songLength: "3:24",
            },
            {
              id: 16,
              songName:
                "Hark! The Herald Angels Sing / Gloria (In Excelsis Deo)",
              songLength: "2:59",
            },
            {
              id: 17,
              songName: "Jesus Oh What a Wonderful Child",
              songLength: "4:26",
            },
          ],
        },
        {
          id: 5,
          albumTitle: "Merry Christmas II You",
          imagePath: "",
          songList: [],
        },
      ],
      name: "Mariah Carey",
      imagePath: "./src/images/MC.jpeg",
      dob: "07-March-1970",
      recordLabel: "Columbia",
    },
    {
      id: 2,
      albums: [
        {
          id: 6,
          albumTitle: "Last Christmas",
          imagePath: "",
          songList: [],
        },
      ],
      name: "Wham!",
      imagePath: "./src/images/wham!.png",
      dob: "25-June-1963",
      recordLabel: "Innervision",
    },
    {
      id: 3,
      albums: [
        {
          id: 7,
          albumTitle: "Christmas",
          imagePath: "",
          songList: [],
        },
      ],
      name: "Michael Bublé",
      imagePath: "./src/images/MB.png",
      dob: "09-September-1975",
      recordLabel: "Reprise",
    },
  ];
};
const fetchSingleArtist = (artistId) => {
  return {
    id: 1,
    albums: [
      {
        id: 4,
        albumTitle: "Merry Christmas",
        imagePath: "./src/images/MC-cover.png",
        songList: [
          {
            id: 8,
            songName: "Silent Night",
            songLength: "3:39",
          },
          {
            id: 9,
            songName: "All I Want for Christmas Is You",
            songLength: "4:01",
          },
          {
            id: 10,
            songName: "O Holy Night",
            songLength: "4:27",
          },
          {
            id: 11,
            songName: "Christmas (Baby Please Come Home)",
            songLength: "2:33",
          },
          {
            id: 12,
            songName: "Miss You Most (At Christmas Time)",
            songLength: "4:32",
          },
          {
            id: 13,
            songName: "Joy To The World",
            songLength: "4:18",
          },
          {
            id: 14,
            songName: "Jesus Born on This Day",
            songLength: "3:41",
          },
          {
            id: 15,
            songName: "Santa Claus is Coming To Town",
            songLength: "3:24",
          },
          {
            id: 16,
            songName: "Hark! The Herald Angels Sing / Gloria (In Excelsis Deo)",
            songLength: "2:59",
          },
          {
            id: 17,
            songName: "Jesus Oh What a Wonderful Child",
            songLength: "4:26",
          },
        ],
      },
      {
        id: 5,
        albumTitle: "Merry Christmas II You",
        imagePath: "./src/images/merry-christmas-ii-you.png",
        songList: [],
      },
    ],
    name: "Mariah Carey",
    imagePath: "./src/images/MC.jpeg",
    dob: "07-March-1970",
    recordLabel: "Columbia",
  };
};

const fetchSingleAlbum = () => {
  return {
    id: 4,
    albumTitle: "Merry Christmas",
    imagePath: "./src/images/MC-cover.png",
    songList: [
      {
        id: 8,
        songName: "Silent Night",
        songLength: "3:39",
      },
      {
        id: 9,
        songName: "All I Want for Christmas Is You",
        songLength: "4:01",
      },
      {
        id: 10,
        songName: "O Holy Night",
        songLength: "4:27",
      },
      {
        id: 11,
        songName: "Christmas (Baby Please Come Home)",
        songLength: "2:33",
      },
      {
        id: 12,
        songName: "Miss You Most (At Christmas Time)",
        songLength: "4:32",
      },
      {
        id: 13,
        songName: "Joy To The World",
        songLength: "4:18",
      },
      {
        id: 14,
        songName: "Jesus Born on This Day",
        songLength: "3:41",
      },
      {
        id: 15,
        songName: "Santa Claus is Coming To Town",
        songLength: "3:24",
      },
      {
        id: 16,
        songName: "Hark! The Herald Angels Sing / Gloria (In Excelsis Deo)",
        songLength: "2:59",
      },
      {
        id: 17,
        songName: "Jesus Oh What a Wonderful Child",
        songLength: "4:26",
      },
    ],
  };
};

const fetchSingleSong = (songId) => {
  return {
    id: 8,
    songName: "Silent Night",
    songLength: "3:39",
    songUrl: "https://www.youtube.com/embed/yXQViqx6GMY",
  };
};

const fetchAlbumArtist = (albumId) => {
  return {
    id: 1,
    albums: [
      {
        id: 4,
        albumTitle: "Merry Christmas",
        imagePath: "./src/images/MC-cover.png",
        songList: [
          {
            id: 8,
            songName: "Silent Night",
            songLength: "3:39",
          },
          {
            id: 9,
            songName: "All I Want for Christmas Is You",
            songLength: "4:01",
          },
          {
            id: 10,
            songName: "O Holy Night",
            songLength: "4:27",
          },
          {
            id: 11,
            songName: "Christmas (Baby Please Come Home)",
            songLength: "2:33",
          },
          {
            id: 12,
            songName: "Miss You Most (At Christmas Time)",
            songLength: "4:32",
          },
          {
            id: 13,
            songName: "Joy To The World",
            songLength: "4:18",
          },
          {
            id: 14,
            songName: "Jesus Born on This Day",
            songLength: "3:41",
          },
          {
            id: 15,
            songName: "Santa Claus is Coming To Town",
            songLength: "3:24",
          },
          {
            id: 16,
            songName: "Hark! The Herald Angels Sing / Gloria (In Excelsis Deo)",
            songLength: "2:59",
          },
          {
            id: 17,
            songName: "Jesus Oh What a Wonderful Child",
            songLength: "4:26",
          },
        ],
      },
      {
        id: 5,
        albumTitle: "Merry Christmas II You",
        imagePath: "./src/images/merry-christmas-ii-you.png",
        songList: [],
      },
    ],
    name: "Mariah Carey",
    imagePath: "./src/images/MC.jpeg",
    dob: "07-March-1970",
    recordLabel: "Columbia",
  };
};

const fetchSongAlbum = (songId) => {
  return {
    id: 4,
    albumTitle: "Merry Christmas",
    imagePath: "./src/images/MC-cover.png",
    songList: [
      {
        id: 8,
        songName: "Silent Night",
        songLength: "3:39",
      },
      {
        id: 9,
        songName: "All I Want for Christmas Is You",
        songLength: "4:01",
      },
      {
        id: 10,
        songName: "O Holy Night",
        songLength: "4:27",
      },
      {
        id: 11,
        songName: "Christmas (Baby Please Come Home)",
        songLength: "2:33",
      },
      {
        id: 12,
        songName: "Miss You Most (At Christmas Time)",
        songLength: "4:32",
      },
      {
        id: 13,
        songName: "Joy To The World",
        songLength: "4:18",
      },
      {
        id: 14,
        songName: "Jesus Born on This Day",
        songLength: "3:41",
      },
      {
        id: 15,
        songName: "Santa Claus is Coming To Town",
        songLength: "3:24",
      },
      {
        id: 16,
        songName: "Hark! The Herald Angels Sing / Gloria (In Excelsis Deo)",
        songLength: "2:59",
      },
      {
        id: 17,
        songName: "Jesus Oh What a Wonderful Child",
        songLength: "4:26",
      },
    ],
  };
};

const fetchSongArtist = (songId) => {
  return {
    id: 1,
    albums: [
      {
        id: 4,
        albumTitle: "Merry Christmas",
        imagePath: "./src/images/MC-cover.png",
        songList: [
          {
            id: 8,
            songName: "Silent Night",
            songLength: "3:39",
          },
          {
            id: 9,
            songName: "All I Want for Christmas Is You",
            songLength: "4:01",
          },
          {
            id: 10,
            songName: "O Holy Night",
            songLength: "4:27",
          },
          {
            id: 11,
            songName: "Christmas (Baby Please Come Home)",
            songLength: "2:33",
          },
          {
            id: 12,
            songName: "Miss You Most (At Christmas Time)",
            songLength: "4:32",
          },
          {
            id: 13,
            songName: "Joy To The World",
            songLength: "4:18",
          },
          {
            id: 14,
            songName: "Jesus Born on This Day",
            songLength: "3:41",
          },
          {
            id: 15,
            songName: "Santa Claus is Coming To Town",
            songLength: "3:24",
          },
          {
            id: 16,
            songName: "Hark! The Herald Angels Sing / Gloria (In Excelsis Deo)",
            songLength: "2:59",
          },
          {
            id: 17,
            songName: "Jesus Oh What a Wonderful Child",
            songLength: "4:26",
          },
        ],
      },
      {
        id: 5,
        albumTitle: "Merry Christmas II You",
        imagePath: "./src/images/merry-christmas-ii-you.png",
        songList: [],
      },
    ],
    name: "Mariah Carey",
    imagePath: "./src/images/MC.jpeg",
    dob: "07-March-1970",
    recordLabel: "Columbia",
  };
};
