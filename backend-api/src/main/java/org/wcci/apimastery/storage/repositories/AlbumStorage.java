package org.wcci.apimastery.storage.repositories;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.entities.Album;

import java.util.Collection;

@Service
public class AlbumStorage {
    private AlbumRepository albumRepo;

    public AlbumStorage(AlbumRepository albumRepo) {
        this.albumRepo = albumRepo;
    }

    public Collection<Album> getAllAlbums() {
        return (Collection<Album>) albumRepo.findAll();
    }

    public Album save(Album album) {
        return albumRepo.save(album);
    }

    public void delete(long albumId) {
        albumRepo.deleteById(albumId);
    }

    public Album retrieveById(long albumId) {
        return albumRepo.findById(albumId).get();
    }
}
