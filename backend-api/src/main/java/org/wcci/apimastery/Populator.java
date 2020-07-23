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
        Artist mCarey = new Artist("Mariah Carey", "", "07-March-1970", "Columbia");
        Artist wham = new Artist("Wham!", "", "25-June-1963", "Innervision");
        Artist mBuble = new Artist("Michael Bublé", "", "09-September-1975", "Reprise");
        Artist vgTrio = new Artist("Vince Guaraldi Trio", "", "17-July-1928", "Fantasy Records");
        Artist kidsBop = new Artist("Kids Bop", "", "09-October-2001", "Razor & Tie");
        Artist nsync = new Artist("*NSYNC", "", "26-May-1997", "Jive Records");
        Artist mCarey = new Artist("Mariah Carey", "./src/images/MC.jpeg", "07-March-1970");
        Artist wham = new Artist("Wham!", "./src/images/wham!.png", "25-June-1963");
        Artist mBuble = new Artist("Michael Bublé", "./src/images/MB.png", "09-September-1975");
        artistRepo.save(mCarey);
        artistRepo.save(wham);
        artistRepo.save(mBuble);
        artistRepo.save(vgTrio);
        artistRepo.save(kidsBop);
        artistRepo.save(nsync);

        // Albums
        Album xmas1 = new Album("Merry Christmas", "", mCarey);
        Album xmas2 = new Album("Merry Christmas II You", "", mCarey);
        Album lastXmas = new Album("Last Christmas", "", wham);
        Album xmas3 = new Album("Christmas", "", mBuble);
        Album charlieBrown = new Album("A Charlie Brown Christmas", "", vgTrio);
        Album kidsBopXmas = new Album("Kids Bop Christmas", "", kidsBop);
        Album homeForChristmas = new Album("Home For Christmas", "", nsync);
        Album xmas1 = new Album("Merry Christmas", "./src/images/MC-cover.png", mCarey, "1994", "Columbia");
        Album xmas2 = new Album("Merry Christmas II You", "./src/images/merry-christmas-ii-you.png", mCarey, "2010", "Columbia");
        Album lastXmas = new Album("Last Christmas", "./src/images/Last-Christmas-Wham.png", wham, "1984", "Innervision");
        Album xmas3 = new Album("Christmas", "./src/images/Christmas-Buble.png", mBuble, "2011", "Reprise");
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
        Song mcMc_3 = new Song("4:27", "O Holy Night", xmas1, "https://www.youtube-nocookie.com/embed/bM9UGg1FINk");//        O Holy Night - 4:27
        Song mcMc_4 = new Song("2:33", "Christmas (Baby Please Come Home)", xmas1, "https://www.youtube-nocookie.com/embed/ah-U9ECRZog");//        Christmas (Baby Please Come Home) - 2:33
        Song mcMc_5 = new Song("4:32", "Miss You Most (At Christmas Time)", xmas1, "https://www.youtube-nocookie.com/embed/vAOIC737e_k");//        Miss You Most (At Christmas Time) - 4:32
        Song mcMc_6 = new Song("4:18", "Joy To The World", xmas1, "https://www.youtube-nocookie.com/embed/1tcbarFCk3w");//        Joy To The World - 4:18
        Song mcMc_7 = new Song("3:41", "Jesus Born on This Day", xmas1, "https://www.youtube-nocookie.com/embed/YGfcSxynZu8");//        Jesus Born on This Day - 3:41
        Song mcMc_8 = new Song("3:24", "Santa Claus is Coming To Town", xmas1, "https://www.youtube-nocookie.com/embed/OsyxFkYZ-aU");//        Santa Claus Is Coming To Town - 3:24
        Song mcMc_9 = new Song("2:59", "Hark! The Herald Angels Sing / Gloria (In Excelsis Deo)", xmas1, "https://www.youtube-nocookie.com/embed/Y7hPy8EJnRU");//        Hark! The Herald Angels Sing"/"Gloria (In Excelsis Deo) - 2:59
        Song mcMc_10 = new Song("4:26", "Jesus Oh What a Wonderful Child", xmas1,"https://www.youtube-nocookie.com/embed/hPCyMkDxh0M");//        Jesus Oh What a Wonderful Child - 4:26
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
        Song mcMc2_1 = new Song("0", "Santa Claus Is Coming to Town", xmas2);
        Song McMc2_2 = new Song("0", "Oh Santa", xmas2);
        Song McMc2_3 = new Song("0", "O Little Town of Bethlehem / Little Drummer Boy", xmas2);
        Song McMc2_4 = new Song("0", "Christmas Time Is in the Air Again", xmas2);
        Song McMc2_5 = new Song("0", "The First Noel / Born Is the King", xmas2);
        Song McMc2_6 = new Song("0", "When Christmas Comes", xmas2);
        Song McMc2_7 = new Song("0", "Here Comes Santa Claus (Right Down Santa Claus Lane) / Housetop Celebration", xmas2);
        Song McMc2_8 = new Song("0", "Charlie Brown Christmas", xmas2);
        Song McMc2_9 = new Song("0", "O Come, All Ye Faithful / Hallelujah Chorus", xmas2);
        Song McMc2_10 = new Song("0", "O Holy Night (live from WPC in South Central Los Angeles)", xmas2);
        Song McMc2_11 = new Song("0", "One Child", xmas2);
        Song McMc2_12 = new Song("0", "All I Want for Christmas Is You - Extra Festive", xmas2);
        Song McMc2_13 = new Song("0", "Auld Lang Syne (The New Year's Anthem)", xmas2);
        songRepo.save(mcMc2_1);
        songRepo.save(mcMc2_2);
        songRepo.save(mcMc2_3);
        songRepo.save(mcMc2_4);
        songRepo.save(mcMc2_5);
        songRepo.save(mcMc2_6);
        songRepo.save(mcMc2_7);
        songRepo.save(mcMc2_8);
        songRepo.save(mcMc2_9);
        songRepo.save(mcMc2_10);
        songRepo.save(mcMc2_11);
        songRepo.save(mcMc2_12);
        songRepo.save(mcMc2_13);


        /* Last Christmas */
        Song wLc_1 = new Song("4:23", "Last Christmas", lastXmas);
        songRepo.save(wLc_1);


        /* Christmas */
        Song mbC_1 = new Song("3:27", "It's Beginning to Look a Lot Like Christmas", xmas3);
        Song mbC_2 = new Song("2:51", "Santa Claus is Coming to Town", xmas3);
        Song mbC_3 = new Song("2:40", "Jingle Bells (feat. The Puppini Sisters)", xmas3);
        Song mbC_4 = new Song("3:37", "White Christmas (with Shania Twain)", xmas3);
        Song mbC_5 = new Song("2:52", "All I Want for Christmas Is You", xmas3);
        Song mbC_6 = new Song("2:00", "Holly Jolly Christmas", xmas3);
        Song mbC_7 = new Song("3:52", "Santa Baby", xmas3);
        Song mbC_8 = new Song("3:50", "Have Yourself a Merry Little Christmas", xmas3);
        Song mbC_9 = new Song("3:08", "Christmas (Baby Please Come Home)", xmas3);
        Song mbC_10 = new Song("3:48", "Silent Night", xmas3);
        Song mbC_11 = new Song("3:42", "  Blue Christmas", xmas3);
        Song mbC_12 = new Song("3:18", "Cold December Night", xmas3);
        Song mbC_13 = new Song("4:25", "I’ll Be Home for Christmas", xmas3);
        Song mbC_14 = new Song(" 4:00", "Ave Maria", xmas3);
        Song mbC_15 = new Song("4:24", "Mis Deseos / Feliz Navidad (with Thalia)", xmas3);
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
        songRepo.save(mbC_16);


        /* A Charlie Brown Christmas */
        Song cbC_1 = new Song("5:09", "O Tannenbaum", charlieBrown);
        Song cbC_2 = new Song("2:25", "What Child is This", charlieBrown);
        Song cbC_3 = new Song("3:12", "My Little Drum", charlieBrown);
        Song cbC_4 = new Song("3:05", "Linus And Lucy", charlieBrown);
        Song cbC_5 = new Song("6:06", "Christmas Time is Here - Instrumental", charlieBrown);
        Song cbC_6 = new Song("2:46", "Christmas Time is Here - Vocal", charlieBrown);
        Song cbC_7 = new Song("2:26", "Skating", charlieBrown);
        Song cbC_8 = new Song("1:55", "Hark, The Heralds Angels Sing", charlieBrown);
        Song cbC_9 = new Song("3:25", "Christmas is Coming", charlieBrown);
        Song cbC_10 = new Song("1:06", "Fur Elise", charlieBrown);
        Song cbC_11 = new Song("3:17", "The Christmas Song", charlieBrown);
        Song cbC_12 = new Song("5:29", "Greensleeves", charlieBrown);
        Song cbC_13 = new Song("2:29", "Great Pumpkin Waltz", charlieBrown);
        Song cbC_14 = new Song("2:00", "Thanksgiving Theme", charlieBrown);
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
        Song kbC_1 = new Song("2:33", "It's The Most Wonderful Time Of The Year", kidsBopXmas);
        Song kbC_2 = new Song("2:27", "Santa Claus Is Coming To Town", kidsBopXmas);
        Song kbC_3 = new Song("3:17", "All I Want For Christmas Is You", kidsBopXmas);
        Song kbC_4 = new Song("3:01", "Santa Tell Me", kidsBopXmas);
        Song kbC_5 = new Song("2:42", "Let It Snow! Let It Snow! Let It Snow!", kidsBopXmas);
        Song kbC_6 = new Song("3:21", "Have Yourself A Merry Little Christmas", kidsBopXmas);
        Song kbC_7 = new Song("2:54", "Mistletoe", kidsBopXmas);
        Song kbC_8 = new Song("2:07", "Rockin' Around The Christmas", kidsBopXmas);
        Song kbC_9 = new Song("2:20", "Christmas (Baby Please Come Home)", kidsBopXmas);
        Song kbC_10 = new Song("3:36", "Last Christmas", kidsBopXmas);
        Song kbC_11 = new Song("2:37", "Rudolph The Red-Nosed Reindeer", kidsBopXmas);
        Song kbC_12 = new Song("2:38", "Blue Christmas", kidsBopXmas);
        Song kbC_13 = new Song("3:53", "12 Days Of Christmas", kidsBopXmas);
        Song kbC_14 = new Song("2:43", "Feliz Navidad", kidsBopXmas);
        Song kbC_15 = new Song("2:21", "Have A Holly Jolly Christmas", kidsBopXmas);
        Song kbC_16 = new Song("2:50", "You're A Mean One, Mr. Grinch", kidsBopXmas);
        Song kbC_17 = new Song("2:03", "Little Saint Nick", kidsBopXmas);
        Song kbC_18 = new Song("2:34", "Do You Wanna Build A Snowman?", kidsBopXmas);
        Song kbC_19 = new Song("2:12", "Jingle Bell Rock", kidsBopXmas);
        Song kbC_20 = new Song("2:27", "Deck The Halls", kidsBopXmas);
        Song kbC_21 = new Song("3:06", "Silver Bells", kidsBopXmas);
        Song kbC_22 = new Song("2:15", "Frosty The Snowman", kidsBopXmas);
        Song kbC_23 = new Song("2:16", "White Christmas", kidsBopXmas);
        Song kbC_24 = new Song("3:08", "I Wish It Could Be Christmas Everyday", kidsBopXmas);
        Song kbC_25 = new Song("3:06", "GO CHRISTMAS! (KIDZ BOP Original)", kidsBopXmas);
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
        Song nSC_1 = new Song("4:28", "Home for Christmas", homeForChristmas);
        Song nSC_2 = new Song("4:32", "Under My Tree", homeForChristmas);
        Song nSC_3 = new Song("4:45", "I Never Knew the Meaning of Christmas", homeForChristmas);
        Song nSC_4 = new Song("4:12", "Merry Christmas, Happy Holidays", homeForChristmas);
        Song nSC_5 = new Song("3:16", "The Christmas Song", homeForChristmas);
        Song nSC_6 = new Song("3:52", "I Guess It's Christmas Time", homeForChristmas);
        Song nSC_7 = new Song("3:43", "All I Want This Christmas", homeForChristmas);
        Song nSC_8 = new Song("3:28", "First Noel", homeForChristmas);
        Song nSC_9 = new Song("4:06", "In Love on Christmas", homeForChristmas);
        Song nSC_10 = new Song("4:29", "It's Christmas", homeForChristmas);
        Song nSC_11 = new Song("3:33", "O Holy Night", homeForChristmas);
        Song nSC_12 = new Song("3:54", "Love's in Our Hearts on Christmas Day", homeForChristmas);
        Song nSC_13 = new Song("3:51", "The Only Gift", homeForChristmas);
        Song nSC_14 = new Song("3:28", "Kiss Me at Midnight", homeForChristmas);
        songRepo.save(nSC_1);
        songRepo.save(nSC_2);
        songRepo.save(nSC_3);
        songRepo.save(nSC_4);
        songRepo.save(nSC_5);
        songRepo.save(nSC_7);
        songRepo.save(nSC_8);
        songRepo.save(nSC_9);
        songRepo.save(nSC_10);
        songRepo.save(nSC_11);
        songRepo.save(nSC_12);
        songRepo.save(nSC_13);
        songRepo.save(nSC_14);

        Song mcMc2_1 = new Song("0", "Santa Claus Is Coming to Town", xmas2, "https://www.youtube-nocookie.com/embed/rbOdImwwzuY");
        Song McMc2_2 = new Song("0", "Oh Santa", xmas2, "https://youtube-nocookie.com/embed/YAIPS8TlGAE");
        Song McMc2_3 = new Song("0", "O Little Town of Bethlehem / Little Drummer Boy", xmas2, "https://www.youtube.com-nocookie.com/embed/kl4xBJJLZWQ");//        3 - "O Little Town of Bethlehem" / "Little Drummer Boy" (medley)
        Song McMc2_4 = new Song("0", "Christmas Time Is in the Air Again", xmas2, "https://www.youtube-nocookie.com/embed/1nVpcnYN67s");//                4 - "Christmas Time Is in the Air Again"
//
        Song McMc2_5 = new Song("0", "The First Noel / Born Is the King", xmas2, "https://www.youtube-nocookie.com/embed/fhdqf1CLbUQ");//        5 - "The First Noel" / "Born Is the King" (interlude)
//
        Song McMc2_6 = new Song("0", "When Christmas Comes", xmas2, "https://www.youtube-nocookie.com/embed/ZKQYbHL7zDs");
        Song McMc2_7 = new Song("0", "Here Comes Santa Claus (Right Down Santa Claus Lane) / Housetop Celebration", xmas2, "https://www.youtube-nocookie.com/embed/58iAIYjLRZs");
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
        Song mbC_2 = new Song("2:51", "Santa Claus is Coming to Town", xmas3, "https://www.youtube-nocookie.com/embed/R8CBoVc_OMI");
        Song mbC_3 = new Song("2:40", "Jingle Bells (feat. The Puppini Sisters)", xmas3, "https://www.youtube-nocookie.com/embed/Nx-DvH41Tjo");
        songRepo.save(mbC_1);
        songRepo.save(mbC_2);
        songRepo.save(mbC_3);
//        White Christmas (with Shania Twain) 3:37
//        All I Want for Christmas Is You 2:52
//        Holly Jolly Christmas 2:00
//        Santa Baby 3:52
//        Have Yourself a Merry Little Christmas 3:50
//        Christmas (Baby Please Come Home) 3:08
//        Silent Night 3:48
//        Blue Christmas 3:42
//        Cold December Night 3:18
//        I’ll Be Home for Christmas 4:25
//        Ave Maria 4:00
//        Mis Deseos / Feliz Navidad (with Thalia) 4:24

    }
}
