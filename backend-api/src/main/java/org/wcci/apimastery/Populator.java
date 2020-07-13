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
        artistRepo.save(mCarey);
        artistRepo.save(wham);
        artistRepo.save(mBuble);

        // Albums
        Album xmas1 = new Album("Merry Christmas", "", mCarey);
        Album xmas2 = new Album("Merry Christmas II You", "", mCarey);
        Album lastXmas = new Album("Last Christmas", "", wham);
        Album xmas3 = new Album("Christmas", "", mBuble);
        albumRepo.save(xmas1);
        albumRepo.save(xmas2);
        albumRepo.save(lastXmas);
        albumRepo.save(xmas3);

        // Songs
        /* Merry Christmas */
        Song mcMc_1 = new Song("3:39", "Silent Night", xmas1);
        Song mcMc_2 = new Song("4:01", "All I Want for Christmas Is You", xmas1);
        Song mcMc_3 = new Song( "4:27", "O Holy Night", xmas1);//        O Holy Night - 4:27
        Song mcMc_4 = new Song( "2:33", "Christmas (Baby Please Come Home)", xmas1);//        Christmas (Baby Please Come Home) - 2:33
        Song mcMc_5 = new Song( "4:32", "Miss You Most (At Christmas Time)", xmas1);//        Miss You Most (At Christmas Time) - 4:32
        Song mcMc_6 = new Song( "4:18", "Joy To The World", xmas1);//        Joy To The World - 4:18
        Song mcMc_7 = new Song( "3:41", "Jesus Born on This Day", xmas1);//        Jesus Born on This Day - 3:41
        Song mcMc_8 = new Song( "3:24", "Santa Claus is Coming To Town", xmas1);//        Santa Claus Is Coming To Town - 3:24
        Song mcMc_9 = new Song( "2:59", "Hark! The Herald Angels Sing / Gloria (In Excelsis Deo)", xmas1);//        Hark! The Herald Angels Sing"/"Gloria (In Excelsis Deo) - 2:59
        Song mcMc_10 = new Song( "4:26", "Jesus Oh What a Wonderful Child", xmas1);//        Jesus Oh What a Wonderful Child - 4:26
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
        Song McMc2_2 = new Song( "0", "Oh Santa", xmas2);
//
//        1 - "Santa Claus Is Coming to Town" (intro)
//
//
//                2 - "Oh Santa!"
//
        Song McMc2_3 = new Song( "0", "O Little Town of Bethlehem / Little Drummer Boy", xmas2);//        3 - "O Little Town of Bethlehem" / "Little Drummer Boy" (medley)
//
        Song McMc2_4 = new Song( "0", "Christmas Time Is in the Air Again", xmas2);//                4 - "Christmas Time Is in the Air Again"
//
        Song McMc2_5 = new Song( "0", "The First Noel / Born Is the King", xmas2);//        5 - "The First Noel" / "Born Is the King" (interlude)
//
        Song McMc2_6 = new Song( "0", "When Christmas Comes", xmas2);
        Song McMc2_7 = new Song( "0", "Here Comes Santa Claus (Right Down Santa Claus Lane) / Housetop Celebration", xmas2);
        Song McMc2_8 = new Song( "0", "Charlie Brown Christmas", xmas2);
        Song McMc2_9 = new Song( "0", "O Come, All Ye Faithful / Hallelujah Chorus", xmas2);
        Song McMc2_10 = new Song( "0", "O Holy Night (live from WPC in South Central Los Angeles)", xmas2);
        Song McMc2_11 = new Song( "0", "One Child", xmas2);
        Song McMc2_12 = new Song( "0", "All I Want for Christmas Is You - Extra Festive", xmas2);
        Song McMc2_13 = new Song( "0", "Auld Lang Syne (The New Year's Anthem)", xmas2);



        /* Last Christmas */
        Song wLc_1 = new Song("4:23", "Last Christmas", lastXmas);


        /* Christmas */
        Song mbC_1 = new Song("3:27", "It's Beginning to Look a Lot Like Christmas", xmas3);
        Song mbC_2 = new Song("2:51", "Santa Claus is Coming to Town", xmas3);
        Song mbC_3 = new Song("2:40", "Jingle Bells (feat. The Puppini Sisters)", xmas3);
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
