package com.alaigal.dockercomposeboot.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "movie_artist", joinColumns = {
            @JoinColumn(name = "student_id", referencedColumnName = "id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "artist_id", referencedColumnName = "id")
    })
    @JsonManagedReference
    private List<Artist> artists;

    public Movie() {
    }

    public Movie(String title, List<Artist> artists) {
        this.title = title;
        this.artists = artists;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }
}
