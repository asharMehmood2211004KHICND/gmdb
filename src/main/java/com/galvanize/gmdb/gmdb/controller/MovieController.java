package com.galvanize.gmdb.gmdb.controller;

import com.galvanize.gmdb.gmdb.repository.ReviewRepository;
import com.galvanize.gmdb.gmdb.service.ReviewService;
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
    @Autowired
    private ReviewService reviewService;

    @PostMapping("")
    public Movie saveMovie(@RequestBody Movie movie){
        //reviewService.saveReviewList(movie.getReviewList());
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
