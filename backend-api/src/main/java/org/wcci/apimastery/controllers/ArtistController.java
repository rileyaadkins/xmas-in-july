package org.wcci.apimastery.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.wcci.apimastery.storage.AlbumStorage;
import org.wcci.apimastery.storage.ArtistStorage;

@RestController
public class ArtistController {

    // Instance variables
    private ArtistStorage artistStorage;
    private AlbumStorage albumStorage;

    // Constructors
    public ArtistController(ArtistStorage artistStorage, AlbumStorage albumStorage) {
        this.artistStorage = artistStorage;
        this.albumStorage = albumStorage;
    }

    // Getters
    public ArtistStorage getArtistStorage() {
        return artistStorage;
    }
    public AlbumStorage getAlbumStorage() {
        return albumStorage;
    }


    // Other methods
}
