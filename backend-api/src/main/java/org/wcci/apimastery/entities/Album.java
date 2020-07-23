package org.wcci.apimastery.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Album {

    @Id
    @GeneratedValue
    private long id;
    @JsonIgnore
    @ManyToOne
    private Artist artist;
    private String releaseYear;
    private String albumTitle;
    private String imagePath;
    private String recordLabel;
    @OneToMany(mappedBy = "songAlbum", orphanRemoval = true)
    private Collection<Song> songList;

    protected Album() {
    }

    ;

    public Album(String albumTitle, String imagePath, Artist artist, String releaseYear, String recordLabel) {
        this.albumTitle = albumTitle;
        this.imagePath = imagePath;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.recordLabel = recordLabel;
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

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getRecordLabel() {
        return recordLabel;
    }
}

