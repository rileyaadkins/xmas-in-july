package org.wcci.apimastery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.apimastery.entities.Album;
import org.wcci.apimastery.entities.Artist;
import org.wcci.apimastery.entities.Song;
import org.wcci.apimastery.storage.repositories.AlbumRepository;
import org.wcci.apimastery.storage.repositories.ArtistRepository;
import org.wcci.apimastery.storage.repositories.SongRepository;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    private ArtistRepository artistRepo;
    @Autowired
    private AlbumRepository albumRepo;
    @Autowired
    private SongRepository songRepo;

    public void run(String... args) throws Exception {

        // Artists
        Artist mCarey = new Artist("Mariah Carey", "./src/images/MC.jpeg", "07-March-1970");
        Artist wham = new Artist("Wham!", "./src/images/wham!.png", "25-June-1963");
        Artist mBuble = new Artist("Michael Bublé", "./src/images/MB.png", "09-September-1975");
        Artist vgTrio = new Artist("Vince Guaraldi Trio", "./src/images/VGT.png", "17-July-1928");
        Artist kidsBop = new Artist("Kids Bop", "./src/images/kidsbop.png", "09-October-2001");
        Artist nsync = new Artist("*NSYNC", "./src/images/nsync.jpg", "26-May-1997");

        artistRepo.save(mCarey);
        artistRepo.save(wham);
        artistRepo.save(mBuble);
        artistRepo.save(vgTrio);
        artistRepo.save(kidsBop);
        artistRepo.save(nsync);

        // Albums
        Album xmas1 = new Album("Merry Christmas", "./src/images/MC-cover.png", mCarey, "1994", "Columbia");
        Album xmas2 = new Album("Merry Christmas II You", "./src/images/merry-christmas-ii-you.png", mCarey, "2010", "Columbia");
        Album lastXmas = new Album("Last Christmas", "./src/images/Last-Christmas-Wham.png", wham, "1984", "Innervision");
        Album xmas3 = new Album("Christmas", "./src/images/Christmas-Buble.png", mBuble, "2011", "Reprise");
        Album charlieBrown = new Album("A Charlie Brown Christmas", "./src/images/charlie-brown.png", vgTrio, "1965", "Fantasy Records");
        Album kidsBopXmas = new Album("Kids Bop Christmas", "./src/images/Kidz-Bob-Christmas.png", kidsBop, "2018", "Razor & Tie");
        Album homeForChristmas = new Album("Home For Christmas", "./src/images/Home_for_Christmas_nsync.png", nsync, "1998", "Trans Continental");

        albumRepo.save(xmas1);
        albumRepo.save(xmas2);
        albumRepo.save(lastXmas);
        albumRepo.save(xmas3);
        albumRepo.save(charlieBrown);
        albumRepo.save(kidsBopXmas);
        albumRepo.save(homeForChristmas);

        // Songs

        /* Merry Christmas */
        Song mcMc_1 = new Song("3:39", "Silent Night", xmas1, "https://www.youtube-nocookie.com/embed/Q63O54RuL-o");
        Song mcMc_2 = new Song("4:01", "All I Want for Christmas Is You", xmas1, "https://www.youtube-nocookie.com/embed/yXQViqx6GMY");
        Song mcMc_3 = new Song("4:27", "O Holy Night", xmas1, "https://www.youtube-nocookie.com/embed/bM9UGg1FINk");
        Song mcMc_4 = new Song("2:33", "Christmas (Baby Please Come Home)", xmas1, "https://www.youtube-nocookie.com/embed/ah-U9ECRZog");
        Song mcMc_5 = new Song("4:32", "Miss You Most (At Christmas Time)", xmas1, "https://www.youtube-nocookie.com/embed/vAOIC737e_k");
        Song mcMc_6 = new Song("4:18", "Joy To The World", xmas1, "https://www.youtube-nocookie.com/embed/1tcbarFCk3w");
        Song mcMc_7 = new Song("3:41", "Jesus Born on This Day", xmas1, "https://www.youtube-nocookie.com/embed/YGfcSxynZu8");
        Song mcMc_8 = new Song("3:24", "Santa Claus is Coming To Town", xmas1, "https://www.youtube-nocookie.com/embed/OsyxFkYZ-aU");
        Song mcMc_9 = new Song("2:59", "Hark! The Herald Angels Sing / Gloria (In Excelsis Deo)", xmas1, "https://www.youtube-nocookie.com/embed/Y7hPy8EJnRU");
        Song mcMc_10 = new Song("4:26", "Jesus Oh What a Wonderful Child", xmas1,"https://www.youtube-nocookie.com/embed/hPCyMkDxh0M");

        songRepo.save(mcMc_1);
        songRepo.save(mcMc_2);
        songRepo.save(mcMc_3);
        songRepo.save(mcMc_4);
        songRepo.save(mcMc_5);
        songRepo.save(mcMc_6);
        songRepo.save(mcMc_7);
        songRepo.save(mcMc_8);
        songRepo.save(mcMc_9);
        songRepo.save(mcMc_10);

        /* Merry Christmas II You */
        Song mcMc2_1 = new Song("0", "Santa Claus Is Coming to Town", xmas2, "https://www.youtube-nocookie.com/embed/rbOdImwwzuY");
        Song McMc2_2 = new Song("0", "Oh Santa", xmas2, "https://youtube-nocookie.com/embed/YAIPS8TlGAE");
        Song McMc2_3 = new Song("0", "O Little Town of Bethlehem / Little Drummer Boy", xmas2, "https://www.youtube.com-nocookie.com/embed/kl4xBJJLZWQ");
        Song McMc2_4 = new Song("0", "Christmas Time Is in the Air Again", xmas2, "https://www.youtube-nocookie.com/embed/1nVpcnYN67s");
        Song McMc2_5 = new Song("0", "The First Noel / Born Is the King", xmas2, "https://www.youtube-nocookie.com/embed/fhdqf1CLbUQ");
        Song McMc2_6 = new Song("0", "When Christmas Comes", xmas2, "https://www.youtube-nocookie.com/embed/ZKQYbHL7zDs");
        Song McMc2_7 = new Song("0", "Here Comes Santa Claus / Housetop Celebration", xmas2, "https://www.youtube-nocookie.com/embed/58iAIYjLRZs");
        Song McMc2_8 = new Song("0", "Charlie Brown Christmas", xmas2, "https://www.youtube-nocookie.com/embed/SC5Fs9jtqf4");
        Song McMc2_9 = new Song("0", "O Come, All Ye Faithful / Hallelujah Chorus", xmas2, "https://www.youtube-nocookie.com/embed/7GgJB2NSrcI");
        Song McMc2_10 = new Song("0", "O Holy Night (live from WPC in South Central Los Angeles)", xmas2, "https://www.youtube.com-nocookie.com/embed/kncrzhe78Kw");
        Song McMc2_11 = new Song("0", "One Child", xmas2, "https://www.youtube-nocookie.com/embed/MmtMkMLCS1Y");
        Song McMc2_12 = new Song("0", "All I Want for Christmas Is You - Extra Festive", xmas2, "https://www.youtube-nocookie.com/embed/erwa_eEYyHY");
        Song McMc2_13 = new Song("0", "Auld Lang Syne (The New Year's Anthem)", xmas2, "https://www.youtube-nocookie.com/embed/DKrCtYPqtiM");

        songRepo.save(mcMc2_1);
        songRepo.save(McMc2_2);
        songRepo.save(McMc2_3);
        songRepo.save(McMc2_4);
        songRepo.save(McMc2_5);
        songRepo.save(McMc2_6);
        songRepo.save(McMc2_7);
        songRepo.save(McMc2_8);
        songRepo.save(McMc2_9);
        songRepo.save(McMc2_10);
        songRepo.save(McMc2_11);
        songRepo.save(McMc2_12);
        songRepo.save(McMc2_13);

        /* Last Christmas */
        Song wLc_1 = new Song("4:23", "Last Christmas", lastXmas, "https://www.youtube-nocookie.com/embed/E8gmARGvPlI");

        songRepo.save(wLc_1);


        /* Christmas */
        Song mbC_1 = new Song("3:27", "It's Beginning to Look a Lot Like Christmas", xmas3, "https://www.youtube-nocookie.com/embed/QJ5DOWPGxwg");
        Song mbC_2 = new Song("2:51", "Santa Claus is Coming to Town", xmas3, "https://www.youtube-nocookie.com/embed/R8CBoVc_OMI" );
        Song mbC_3 = new Song("2:40", "Jingle Bells (feat. The Puppini Sisters)", xmas3, "https://www.youtube-nocookie.com/embed/Nx-DvH41Tjo");
        Song mbC_4 = new Song("3:37", "White Christmas (with Shania Twain)", xmas3, "https://www.youtube.com/embed/30TkClWvT5");
        Song mbC_5 = new Song("2:52", "All I Want for Christmas Is You", xmas3, "https://www.youtube.com/embed/pw3PhhSfcQg");
        Song mbC_6 = new Song("2:00", "Holly Jolly Christmas", xmas3, "https://www.youtube.com/embed/Dkq3LD-4pmM");
        Song mbC_7 = new Song("3:52", "Santa Baby", xmas3, "https://www.youtube.com/embed/JnOLam2AwXY");
        Song mbC_8 = new Song("3:50", "Have Yourself a Merry Little Christmas", xmas3, "https://www.youtube.com/embed/l3l83C-we-k");
        Song mbC_9 = new Song("3:08", "Christmas (Baby Please Come Home)", xmas3, "https://www.youtube.com/embed/mBycW6iu8GM");
        Song mbC_10 = new Song("3:48", "Silent Night", xmas3, "https://www.youtube.com/embed/-iZGh91-v7Y");
        Song mbC_11 = new Song("3:42", "Blue Christmas", xmas3, "https://www.youtube.com/embed/im2JjOhTW80");
        Song mbC_12 = new Song("3:18", "Cold December Night", xmas3, "https://www.youtube.com/embed/XtB0LqyJsdA");
        Song mbC_13 = new Song("4:25", "I’ll Be Home for Christmas", xmas3 , "https://www.youtube.com/embed/0yhI35F2NB0");
        Song mbC_14 = new Song(" 4:00", "Ave Maria", xmas3, "https://www.youtube.com/embed/323gz5xNZMI" );
        Song mbC_15 = new Song("4:24", "Mis Deseos / Feliz Navidad (with Thalia)", xmas3, "https://www.youtube.com/embed/SK7cpuhwoP0");

        songRepo.save(mbC_1);
        songRepo.save(mbC_2);
        songRepo.save(mbC_3);
        songRepo.save(mbC_4);
        songRepo.save(mbC_5);
        songRepo.save(mbC_6);
        songRepo.save(mbC_7);
        songRepo.save(mbC_8);
        songRepo.save(mbC_9);
        songRepo.save(mbC_10);
        songRepo.save(mbC_11);
        songRepo.save(mbC_12);
        songRepo.save(mbC_13);
        songRepo.save(mbC_14);
        songRepo.save(mbC_15);


        /* A Charlie Brown Christmas */
        Song cbC_1 = new Song("5:09", "O Tannenbaum", charlieBrown, "https://www.youtube.com/embed/IokMaYTXxFw");
        Song cbC_2 = new Song("2:25", "What Child is This", charlieBrown, "https://www.youtube.com/embed/cxkH-KkhI1Y");
        Song cbC_3 = new Song("3:12", "My Little Drum", charlieBrown, "https://www.youtube.com/embed/n1EuRYLtcqc");
        Song cbC_4 = new Song("3:05", "Linus And Lucy", charlieBrown, "https://www.youtube.com/embed/10IZxbxlRww");
        Song cbC_5 = new Song("6:06", "Christmas Time is Here - Instrumental", charlieBrown, "https://www.youtube.com/embed/9pmWeB4by4I\n");
        Song cbC_6 = new Song("2:46", "Christmas Time is Here - Vocal", charlieBrown, "https://www.youtube.com/embed/hgbdlxNnNJQ");
        Song cbC_7 = new Song("2:26", "Skating", charlieBrown, "https://www.youtube.com/embed/yFgBcc4WOKo");
        Song cbC_8 = new Song("1:55", "Hark, The Heralds Angels Sing", charlieBrown, "https://www.youtube.com/embed/iTF-r8vkNQA");
        Song cbC_9 = new Song("3:25", "Christmas is Coming", charlieBrown, "https://www.youtube.com/embed/C4up7-XES7Y");
        Song cbC_10 = new Song("1:06", "Fur Elise", charlieBrown, "https://www.youtube.com/embed/R4Yw1O9wzyM");
        Song cbC_11 = new Song("3:17", "The Christmas Song", charlieBrown, "https://www.youtube.com/embed/VRqXUB-mOC8");
        Song cbC_12 = new Song("5:29", "Greensleeves", charlieBrown, "https://www.youtube.com/embed/Cke2ix_d1hQ");
        Song cbC_13 = new Song("2:29", "Great Pumpkin Waltz", charlieBrown, "https://www.youtube.com/embed/bh0iiuiJyh8");
        Song cbC_14 = new Song("2:00", "Thanksgiving Theme", charlieBrown, "https://www.youtube.com/embed/lT-ZliSICyI");

        songRepo.save(cbC_1);
        songRepo.save(cbC_2);
        songRepo.save(cbC_3);
        songRepo.save(cbC_4);
        songRepo.save(cbC_5);
        songRepo.save(cbC_6);
        songRepo.save(cbC_7);
        songRepo.save(cbC_8);
        songRepo.save(cbC_9);
        songRepo.save(cbC_10);
        songRepo.save(cbC_11);
        songRepo.save(cbC_12);
        songRepo.save(cbC_13);
        songRepo.save(cbC_14);


        /* Kids Bops Christmas */
        Song kbC_1 = new Song("2:33", "It's The Most Wonderful Time Of The Year", kidsBopXmas, "https://www.youtube.com/embed/jEY0Zimey34" );
        Song kbC_2 = new Song("2:27", "Santa Claus Is Coming To Town", kidsBopXmas, "https://www.youtube.com/embed/dSf-tbPSk8Q");
        Song kbC_3 = new Song("3:17", "All I Want For Christmas Is You", kidsBopXmas,"https://www.youtube.com/embed/zkVoSlEbnHE");
        Song kbC_4 = new Song("3:01", "Santa Tell Me", kidsBopXmas,"https://www.youtube.com/embed/zkVoSlEbnHE");
        Song kbC_5 = new Song("2:42", "Let It Snow! Let It Snow! Let It Snow!", kidsBopXmas,"https://www.youtube.com/embed/PqojzxyRoRE");
        Song kbC_6 = new Song("3:21", "Have Yourself A Merry Little Christmas", kidsBopXmas,"https://www.youtube.com/embed/ch8Gafg6CuI");
        Song kbC_7 = new Song("2:54", "Mistletoe", kidsBopXmas, "https://www.youtube.com/embed/rUnP2qKuS68");
        Song kbC_8 = new Song("2:07", "Rockin' Around The Christmas", kidsBopXmas,"https://www.youtube.com/embed/PCxZtv9_edc");
        Song kbC_9 = new Song("2:20", "Christmas (Baby Please Come Home)", kidsBopXmas,"https://www.youtube.com/embed/nU6DqTDh57Y");
        Song kbC_10 = new Song("3:36", "Last Christmas", kidsBopXmas,"https://www.youtube.com/embed/69J4YQLFJc8");
        Song kbC_11 = new Song("2:37", "Rudolph The Red-Nosed Reindeer", kidsBopXmas,"https://www.youtube.com/embed/xtPx7toeEFM");
        Song kbC_12 = new Song("2:38", "Blue Christmas", kidsBopXmas,"https://www.youtube.com/embed/QXQZCEpIdY8");
        Song kbC_13 = new Song("3:53", "12 Days Of Christmas", kidsBopXmas,"https://www.youtube.com/embed/zqXb41rNInM");
        Song kbC_14 = new Song("2:43", "Feliz Navidad", kidsBopXmas,"https://www.youtube.com/embed/JXrnt5F-e7s");
        Song kbC_15 = new Song("2:21", "Have A Holly Jolly Christmas", kidsBopXmas,"https://www.youtube.com/embed/QiyEoz4vZMI");
        Song kbC_16 = new Song("2:50", "You're A Mean One, Mr. Grinch", kidsBopXmas,"https://www.youtube.com/embed/kkO7h_a6Njo");
        Song kbC_17 = new Song("2:03", "Little Saint Nick", kidsBopXmas,"https://www.youtube.com/embed/D4R2gvDpNNM");
        Song kbC_18 = new Song("2:34", "Do You Wanna Build A Snowman?", kidsBopXmas,"https://www.youtube.com/embed/Ba42APiFoRo");
        Song kbC_19 = new Song("2:12", "Jingle Bell Rock", kidsBopXmas,"https://www.youtube.com/embed/Ba42APiFoRo");
        Song kbC_20 = new Song("2:27", "Deck The Halls", kidsBopXmas,"https://www.youtube.com/embed/rSNwsogMPGQ");
        Song kbC_21 = new Song("3:06", "Silver Bells", kidsBopXmas,"https://www.youtube.com/embed/OQ0nuG1NWh8");
        Song kbC_22 = new Song("2:15", "Frosty The Snowman", kidsBopXmas,"https://www.youtube.com/embed/Yh55Qw4dNIY");
        Song kbC_23 = new Song("2:16", "White Christmas", kidsBopXmas,"https://www.youtube.com/embed/IXtz4ibSCHY");
        Song kbC_24 = new Song("3:08", "I Wish It Could Be Christmas Everyday", kidsBopXmas,"https://www.youtube.com/embed/fG_9EniuWKE");
        Song kbC_25 = new Song("3:06", "GO CHRISTMAS! (KIDZ BOP Original)", kidsBopXmas,"https://www.youtube.com/embed/fG_9EniuWKE");

        songRepo.save(kbC_1);
        songRepo.save(kbC_2);
        songRepo.save(kbC_3);
        songRepo.save(kbC_4);
        songRepo.save(kbC_5);
        songRepo.save(kbC_6);
        songRepo.save(kbC_7);
        songRepo.save(kbC_8);
        songRepo.save(kbC_9);
        songRepo.save(kbC_10);
        songRepo.save(kbC_11);
        songRepo.save(kbC_12);
        songRepo.save(kbC_13);
        songRepo.save(kbC_14);
        songRepo.save(kbC_15);
        songRepo.save(kbC_16);
        songRepo.save(kbC_17);
        songRepo.save(kbC_18);
        songRepo.save(kbC_19);
        songRepo.save(kbC_20);
        songRepo.save(kbC_21);
        songRepo.save(kbC_22);
        songRepo.save(kbC_23);
        songRepo.save(kbC_24);
        songRepo.save(kbC_25);


        /* Home For Christmas */
        Song nSC_1 = new Song("4:28", "Home for Christmas", homeForChristmas, "https://www.youtube.com/embed/71a-qt4lLsM");
        Song nSC_2 = new Song("4:32", "Under My Tree", homeForChristmas, "https://www.youtube.com/embed/DHoDARqFQxQ");
        Song nSC_3 = new Song("4:45", "I Never Knew the Meaning of Christmas", homeForChristmas, "https://www.youtube.com/embed/BZRqjPMwrVk");
        Song nSC_4 = new Song("4:12", "Merry Christmas, Happy Holidays", homeForChristmas, "https://www.youtube.com/embed/oeLfuIzF6v8");
        Song nSC_5 = new Song("3:16", "The Christmas Song", homeForChristmas, "https://www.youtube.com/embed/dItJdGbWeyY");
        Song nSC_6 = new Song("3:52", "I Guess It's Christmas Time", homeForChristmas, "https://www.youtube.com/embed/Qu3aqM1BnLc");
        Song nSC_7 = new Song("3:43", "All I Want This Christmas", homeForChristmas, "https://www.youtube.com/embed/3g7xnlGodus");
        Song nSC_8 = new Song("3:28", "First Noel", homeForChristmas, "https://www.youtube.com/embed/6CbL8qndoVE");
        Song nSC_9 = new Song("4:06", "In Love on Christmas", homeForChristmas, "https://www.youtube.com/embed/CuZqI5_pQZU");
        Song nSC_10 = new Song("4:29", "It's Christmas", homeForChristmas, "https://www.youtube.com/embed/0x82hirHc8o");
        Song nSC_11 = new Song("3:33", "O Holy Night", homeForChristmas, "https://www.youtube.com/embed/IHOTA4ySBSk");
        Song nSC_12 = new Song("3:54", "Love's in Our Hearts on Christmas Day", homeForChristmas, "https://www.youtube.com/embed/d3QBe2kFStg");
        Song nSC_13 = new Song("3:51", "The Only Gift", homeForChristmas, "https://www.youtube.com/embed/RKkpmV6cxlc");
        Song nSC_14 = new Song("3:28", "Kiss Me at Midnight", homeForChristmas, "https://www.youtube.com/embed/kGZjQF23g44");

        songRepo.save(nSC_1);
        songRepo.save(nSC_2);
        songRepo.save(nSC_3);
        songRepo.save(nSC_4);
        songRepo.save(nSC_5);
        songRepo.save(nSC_6);
        songRepo.save(nSC_7);
        songRepo.save(nSC_8);
        songRepo.save(nSC_9);
        songRepo.save(nSC_10);
        songRepo.save(nSC_11);
        songRepo.save(nSC_12);
        songRepo.save(nSC_13);
        songRepo.save(nSC_14);









    }
}
