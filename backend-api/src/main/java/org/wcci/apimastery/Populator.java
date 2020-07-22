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
        albumRepo.save(xmas1);
        albumRepo.save(xmas2);
        albumRepo.save(lastXmas);
        albumRepo.save(xmas3);
        albumRepo.save(charlieBrown);
        albumRepo.save(kidsBopXmas);
        albumRepo.save(homeForChristmas);

        // Songs

        /* Merry Christmas */
        Song mcMc_1 = new Song("3:39", "Silent Night", xmas1);
        Song mcMc_2 = new Song("4:01", "All I Want for Christmas Is You", xmas1);
        Song mcMc_3 = new Song("4:27", "O Holy Night", xmas1);
        Song mcMc_4 = new Song("2:33", "Christmas (Baby Please Come Home)", xmas1);
        Song mcMc_5 = new Song("4:32", "Miss You Most (At Christmas Time)", xmas1);
        Song mcMc_6 = new Song("4:18", "Joy To The World", xmas1);
        Song mcMc_7 = new Song("3:41", "Jesus Born on This Day", xmas1);
        Song mcMc_8 = new Song("3:24", "Santa Claus is Coming To Town", xmas1);
        Song mcMc_9 = new Song("2:59", "Hark! The Herald Angels Sing / Gloria (In Excelsis Deo)", xmas1);
        Song mcMc_10 = new Song("4:26", "Jesus Oh What a Wonderful Child", xmas1);
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

        /* Last Christmas */
        Song wLc_1 = new Song("4:23", "Last Christmas", lastXmas);

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


        /* Kids Bops Christmas */
        Song kbC_1 = new Song("", "It's The Most Wonderful Time Of The Year", kidsBopXmas);
        Song kbC_2 = new Song("", "Santa Claus Is Coming To Town", kidsBopXmas);
        Song kbC_3 = new Song("", "All I Want For Christmas Is You", kidsBopXmas);
        Song kbC_4 = new Song("", "Santa Tell Me", kidsBopXmas);
        Song kbC_5 = new Song("", "Let It Snow! Let It Snow! Let It Snow!", kidsBopXmas);
        Song kbC_6 = new Song("", "Have Yourself A Merry Little Christmas", kidsBopXmas);
        Song kbC_7 = new Song("", "Mistletoe", kidsBopXmas);
        Song kbC_8 = new Song("", "Rockin' Around The Christmas", kidsBopXmas);
        Song kbC_9 = new Song("", "Christmas (Baby Please Come Home)", kidsBopXmas);
        Song kbC_10 = new Song("", "Last Christmas", kidsBopXmas);
        Song kbC_11 = new Song("", "Rudolph The Red-Nosed Reindeer", kidsBopXmas);
        Song kbC_12 = new Song("", "Blue Christmas", kidsBopXmas);
        Song kbC_13 = new Song("", "12 Days Of Christmas", kidsBopXmas);
        Song kbC_14 = new Song("", "Feliz Navidad", kidsBopXmas);
        Song kbC_15 = new Song("", "Have A Holly Jolly Christmas", kidsBopXmas);
        Song kbC_16 = new Song("", "You're A Mean One, Mr. Grinch", kidsBopXmas);
        Song kbC_17 = new Song("", "Little Saint Nick", kidsBopXmas);
        Song kbC_18 = new Song("", "Do You Wanna Build A Snowman?", kidsBopXmas);
        Song kbC_19 = new Song("", "Jingle Bell Rock", kidsBopXmas);
        Song kbC_20 = new Song("", "Deck The Halls", kidsBopXmas);
        Song kbC_21 = new Song("", "Silver Bells", kidsBopXmas);
        Song kbC_22 = new Song("", "Frosty The Snowman", kidsBopXmas);
        Song kbC_23 = new Song("", "White Christmas", kidsBopXmas);
        Song kbC_24 = new Song("", "I Wish It Could Be Christmas Everyday", kidsBopXmas);
        Song kbC_25 = new Song("", "GO CHRISTMAS! (KIDZ BOP Original)", kidsBopXmas);


    }
}
