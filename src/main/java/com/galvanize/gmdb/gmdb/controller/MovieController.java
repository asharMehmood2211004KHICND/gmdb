package com.galvanize.gmdb.gmdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.galvanize.gmdb.gmdb.entity.Movie;
import com.galvanize.gmdb.gmdb.service.MovieService;
import com.galvanize.gmdb.gmdb.service.MovieServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired    
    private MovieService movieService;

    @PostMapping("")
    public Movie saveMovie(@RequestBody Movie movie){
            return movieService.saveMovie(movie);

    }

    @GetMapping("")
    public List<Movie> fetchMovieList(){
        return  movieService.fetchMovieList();
    }

    @GetMapping("/{id}")
    public Movie fetchMovieById(@PathVariable("id") Long movieId){
        return movieService.fetchMovieById(movieId);
    }

}
