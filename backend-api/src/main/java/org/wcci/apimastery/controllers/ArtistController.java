package org.wcci.apimastery.controllers;

import org.springframework.web.bind.annotation.*;
import org.wcci.apimastery.entities.Album;
import org.wcci.apimastery.entities.Artist;
import org.wcci.apimastery.storage.AlbumStorage;
import org.wcci.apimastery.storage.ArtistStorage;

import java.util.Collection;

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

    @GetMapping("/api/artists")
    public Collection<Artist> getAllArtists() {
        return artistStorage.getAllArtists();
    }

    @GetMapping("/api/artists/{id}")
    public Artist showSingleArtist(@PathVariable long id) {
        return artistStorage.retrieveById(id);
    }

    @PostMapping("/api/artists")
    public Artist addArtist(@RequestBody Artist artist) {
        return artistStorage.save(artist);
    }

    @DeleteMapping("/api/artists/{id}")
    public Collection<Artist> deleteArtist(@PathVariable long id) {
        artistStorage.delete(id);
        return artistStorage.getAllArtists();
    }

    @PatchMapping("/api/artists/{artistId}/album")
    public Artist addAlbumToArtist(@PathVariable long artistId, @RequestBody Album album) {
        Artist artist = artistStorage.retrieveById(artistId);
        Album albumToAdd = new Album(album.getAlbumTitle(), album.getImagePath(), artist);
        albumStorage.save(albumToAdd);
        return albumToAdd.getArtist();
    }
}

