package com.alaigal.dockercomposeboot.controller;

import com.alaigal.dockercomposeboot.model.Artist;
import com.alaigal.dockercomposeboot.service.ArtistService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artist")
public class ArtistController {
    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @PostMapping
    public Artist postArtist(@RequestBody Artist artist){
        return artistService.postArtist(artist);
    }

    @GetMapping
    public List<Artist> getALlArtists(){
        return artistService.getAllArtists();
    }

    @GetMapping("/{id}")
    public Artist getArtistById(@PathVariable Long id){
        return artistService.getArtistById(id);
    }
}
