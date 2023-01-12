package com.galvanize.gmdb.gmdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galvanize.gmdb.gmdb.entity.Movie;
import com.galvanize.gmdb.gmdb.repository.MovieRepository;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie saveMovie(Movie movie) {
        // TODO Auto-generated method stub
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> fetchMovieList() {
//        System.out.println(movieRepository.findById(1));
        return  movieRepository.findAll();
    }

    @Override
    public Movie fetchMovieById(Long movieId) {
        return movieRepository.findById(movieId).get();
    }

}
