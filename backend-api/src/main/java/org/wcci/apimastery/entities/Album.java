package org.wcci.apimastery.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Album {

    @Id
    @GeneratedValue
    private long id;
//    added annotation
    @JsonIgnore
    @ManyToOne
    private Artist artist;
    private String albumTitle;
    private String imagePath;
    @OneToMany (mappedBy = "songAlbum", orphanRemoval = true)
    private Collection<Song> songList;

    protected Album(){};

    public Album(String albumTitle, String imagePath, Artist artist) {
        this.albumTitle = albumTitle;
        this.imagePath = imagePath;
//        added to constructor
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }

    public long getId() {
            return id;
        }

        public String getAlbumTitle() {
            return albumTitle;
        }

        public String getImagePath() {
            return imagePath;
        }

        public Collection<Song> getSongList() {
            return songList;
        }

}

