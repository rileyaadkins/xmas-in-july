package org.wcci.apimastery.storage.repositories;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.entities.Song;

@Service
public class SongStorage {


    private SongRepository songRepo;

    public SongStorage(SongRepository songRepo) {
        this.songRepo = songRepo;
    }

    public SongRepository getSongRepo() {
        return songRepo;
    }

    public Song saveToDatabase(Song song) {
        return songRepo.save(song);
    }

    public void deleteFromDatabase(long songId) {
        songRepo.deleteById(songId);
    }
}
