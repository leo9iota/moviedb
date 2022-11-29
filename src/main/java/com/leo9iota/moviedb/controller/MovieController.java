package com.leo9iota.moviedb.controller;

import com.leo9iota.moviedb.model.Movie;
import com.leo9iota.moviedb.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @PostMapping("/create")
    public void createMovie(@RequestBody Movie movie) {
        movieRepository.insert(movie);
    }

    @PostMapping("/delete/{id}")
    public void deleteMovie(@PathVariable String id) {
        movieRepository.deleteById(id);
    }

    @GetMapping("/list")
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }
}
