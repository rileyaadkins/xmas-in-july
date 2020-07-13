package org.wcci.apimastery.storage;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.entities.Album;
import org.wcci.apimastery.entities.Artist;
import org.wcci.apimastery.storage.repositories.ArtistRepository;

import java.util.Collection;

@Service
public class ArtistStorage {

    private ArtistRepository artistRepo;


    public ArtistStorage(ArtistRepository artistRepo) {
        this.artistRepo = artistRepo;

    }

    public Collection<Artist> getAllArtists() {
        return (Collection<Artist>) artistRepo.findAll();
    }

    public Artist save(Artist artist) {
        return artistRepo.save(artist);
    }

    public void delete(long artistId) {

        artistRepo.deleteById(artistId);
    }

    public Artist retrieveById(long artistId) {
        return artistRepo.findById(artistId).get();
    }
}
