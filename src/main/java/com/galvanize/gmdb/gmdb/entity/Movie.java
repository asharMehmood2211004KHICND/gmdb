package com.galvanize.gmdb.gmdb.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Entity
@ToString
// @Table(name = "movie_table")
public class Movie {
    public Movie(long movieId, String movieTitle, String yearReleased, String runTime, String genre, List<Review> reviewList) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.yearReleased = yearReleased;
        this.runTime = runTime;
        this.genre = genre;
        this.reviewList = reviewList;
    }

    public Movie() {
    }
//    public Movie(long movieId, String movieTitle, String yearReleased, String runTime, String genre) {
//        this.movieId = movieId;
//        this.movieTitle = movieTitle;
//        this.yearReleased = yearReleased;
//        this.runTime = runTime;
//        this.genre = genre;

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setYearReleased(String yearReleased) {
        this.yearReleased = yearReleased;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public long getMovieId() {
        return movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getYearReleased() {
        return yearReleased;
    }

    public String getRunTime() {
        return runTime;
    }

    public String getGenre() {
        return genre;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }
//    }

//    public Movie(){}

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
                                                        //mappedBy="movie"
    @OneToMany( cascade = CascadeType.ALL)
//    @JoinColumn(name = "movie_review_fk",referencedColumnName = "movieId")

    private List<Review> reviewList;

//    @Override
//    public String toString() {
//        return "Movie [movieId=" + movieId + ", movieTitle=" + movieTitle + ", yearReleased=" + yearReleased
//                + ", runTime=" + runTime + ", genre=" + genre + "]";
//    }

    
}
 