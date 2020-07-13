package org.wcci.apimastery.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wcci.apimastery.entities.Song;
import org.wcci.apimastery.storage.AlbumStorage;
import org.wcci.apimastery.storage.SongStorage;


@RestController
public class SongController {
    SongStorage songStorage;
    AlbumStorage albumStorage;

    public SongController(SongStorage songStorage, AlbumStorage albumStorage) {
        this.songStorage = songStorage;
        this.albumStorage = albumStorage;
    }

    @GetMapping("/api/song/{id}")
    public Song showSingleSong(@PathVariable long id) {
        return songStorage.findById(id);
    }
}
