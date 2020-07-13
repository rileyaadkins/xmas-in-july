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
//        All I want For Christmas is you - 4:01
//        O Holy Night - 4:27
//        Christmas (Baby Please Come Home) - 2:33
//        Miss You Most (At Christmas Time) - 4:32
//        Joy To The World - 4:18
//        Jesus Born on This Day - 3:41
//        Santa Claus Is Coming To Town - 3:24
//        Hark! The Herald Angels Sing"/"Gloria (In Excelsis Deo) - 2:59
//        Jesus Oh What a Wonderful Child - 4:26


        /* Merry Christmas II You */
        Song mcMc2_1 = new Song("0", "Santa Claus Is Coming to Town", xmas2);
//
//        1 - "Santa Claus Is Coming to Town" (intro)
//
//
//                2 - "Oh Santa!"
//
//        3 - "O Little Town of Bethlehem" / "Little Drummer Boy" (medley)
//
//                4 - "Christmas Time Is in the Air Again"
//
//        5 - "The First Noel" / "Born Is the King" (interlude)
//
//                6 - When Christmas Comes
//
//
//        7 - "Here Comes Santa Claus (Right Down Santa Claus Lane)" / "Housetop Celebration"
//
//
//        8 - Charlie Brown Christmas
//
//        9 - "O Come, All Ye Faithful" / "Hallelujah Chorus"
//
//        10 - "O Holy Night" (live from WPC in South Central Los Angeles)
//
//
//        11 -One Child"
//
//        12 - "All I Want for Christmas Is You – Extra Festive"
//
//        13 - "Auld Lang Syne (The New Year's Anthem)"




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
