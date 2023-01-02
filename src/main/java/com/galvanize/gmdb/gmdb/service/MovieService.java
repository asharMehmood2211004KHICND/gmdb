package com.galvanize.gmdb.gmdb.service;

import com.galvanize.gmdb.gmdb.entity.Movie;

import java.util.List;

public interface MovieService {

   public  Movie saveMovie(Movie movie);

    public List<Movie> fetchMovieList();

    Movie fetchMovieById(Long movieId);
}
