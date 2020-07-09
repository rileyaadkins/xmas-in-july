package org.wcci.apimastery.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Album {
    @Id
    @GeneratedValue
    private long id;
    private String albumTitle;
    private String imagePath;
    @OneToMany (mappedBy = "songAlbum")
    private Collection<Song> songList;
}
