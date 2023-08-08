package com.alaigal.dockercomposeboot.controller;

import com.alaigal.dockercomposeboot.model.Movie;
import com.alaigal.dockercomposeboot.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie){
        return movieService.addMovie(movie);
    }

    @GetMapping
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Long id){
        return movieService.getMovieById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteMovie(@PathVariable Long id){
        return movieService.deleteMovieById(id);
    }
}
