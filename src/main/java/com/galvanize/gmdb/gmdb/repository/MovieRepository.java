package com.galvanize.gmdb.gmdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galvanize.gmdb.gmdb.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> { 
    
}
