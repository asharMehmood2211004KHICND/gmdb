package com.galvanize.gmdb.gmdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galvanize.gmdb.gmdb.entity.Movie;
import com.galvanize.gmdb.gmdb.service.MovieService;
import com.galvanize.gmdb.gmdb.service.MovieServiceImpl;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired    
    private MovieService movieService;

    @PostMapping("")
    public Movie saveMovie(@RequestBody Movie movie){
            return movieService.saveMovie(movie);

    }

}
