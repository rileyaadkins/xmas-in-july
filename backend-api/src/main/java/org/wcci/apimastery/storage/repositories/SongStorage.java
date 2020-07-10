package org.wcci.apimastery.storage.repositories;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.entities.Song;

import java.util.Collection;

@Service
public class SongStorage {


    private SongRepository songRepo;

    public SongStorage(SongRepository songRepo) {
        this.songRepo = songRepo;
    }

    public Collection<Song> getAllSongs() {
        return (Collection<Song>) songRepo.findAll();
    }

    public Song save(Song song) {
        return songRepo.save(song);
    }

    public void delete(long songId) {
        songRepo.deleteById(songId);
    }
}
