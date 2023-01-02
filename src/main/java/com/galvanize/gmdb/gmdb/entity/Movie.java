package com.galvanize.gmdb.gmdb.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
// @Table(name = "movie_table")
public class Movie {
   
    
    public Movie(long movieId, String movieTitle, String yearReleased, String runTime, String genre) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.yearReleased = yearReleased;
        this.runTime = runTime;
        this.genre = genre;
    }

    public Movie(){}

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }
    public String getMovieTitle() {
        return movieTitle;
    }
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
    public String getYearReleased() {
        return yearReleased;
    }
    public void setYearReleased(String yearReleased) {
        this.yearReleased = yearReleased;
    }
    public String getRunTime() {
        return runTime;
    }
    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Id
    // @SequenceGenerator(
    //     name = "movie_sequence",
    //     sequenceName = "movie_sequence",
    //     allocationSize = 1
    // )
    @GeneratedValue(
        strategy = GenerationType.AUTO
        //generator = "student_sequence"
    )
    private long movieId;

    private String movieTitle;
    private String yearReleased;
    private String runTime;
    private String genre;
    @OneToMany(
        
    )
    private List<Review> movieReviews = new ArrayList<>(); 

    
    @Override
    public String toString() {
        return "Movie [movieId=" + movieId + ", movieTitle=" + movieTitle + ", yearReleased=" + yearReleased
                + ", runTime=" + runTime + ", genre=" + genre + "]";
    }

    
}
 