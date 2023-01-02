package com.galvanize.gmdb.gmdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galvanize.gmdb.gmdb.entity.Movie;
import com.galvanize.gmdb.gmdb.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie saveMovie(Movie movie) {
        // TODO Auto-generated method stub
        return movieRepository.save(movie);
    }
    
}
