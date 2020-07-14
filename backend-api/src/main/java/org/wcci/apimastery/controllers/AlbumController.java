package org.wcci.apimastery.controllers;

import org.springframework.web.bind.annotation.*;
import org.wcci.apimastery.entities.Album;
import org.wcci.apimastery.entities.Artist;
import org.wcci.apimastery.entities.Song;
import org.wcci.apimastery.storage.AlbumStorage;
import org.wcci.apimastery.storage.SongStorage;

import java.util.Collection;


@RestController
public class AlbumController {

    // Instance variables

    private SongStorage songStorage;
    private AlbumStorage albumStorage;


    public AlbumController(SongStorage songStorage, AlbumStorage albumStorage) {
        this.songStorage = songStorage;
        this.albumStorage = albumStorage;
    }

    @GetMapping("/api/albums")
    public Collection<Album> getAllAlbums() {
        return albumStorage.getAllAlbums();
    }

    @GetMapping("/api/albums/{id}")
    public Album getAlbumById(@PathVariable long id) {
        return albumStorage.retrieveById(id);
    }

    @PatchMapping("/api/albums/{id}/song")
    public Album addSongToAlbum(@PathVariable long id, @RequestBody Song song) {
        Album album = albumStorage.retrieveById(id);
        Song songToAdd = new Song(song.getSongLength(), song.getSongName(), album);
        songStorage.save(songToAdd);
        return songToAdd.getSongAlbum();
    }


    @DeleteMapping("/api/albums/{id}")
    public Artist deleteAlbum(@PathVariable long id) {
        Album album = albumStorage.retrieveById(id);
        albumStorage.delete(id);
        return album.getArtist();
    }


}
