package com.galvanize.gmdb.gmdb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Entity
public class Review {
    public Review(long reviewId, String reviewText, Movie movie) {
        this.reviewId = reviewId;
        this.reviewText = reviewText;
        this.movie = movie;
    }

    public Review() {
    }

    public long getReviewId() {
        return reviewId;
    }

    public void setReviewId(long reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reviewId;
    private String reviewText;

    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) {
        this.reviewer = reviewer;
    }

    //    @ManyToOne @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    @JoinColumn(name = "movie_id")
//    private Movie movie;
    @ManyToOne
    @JoinColumn(name="MOVIE_ID",referencedColumnName="MOVIE_ID")
    @JsonIgnore
    private Movie movie;

    @ManyToOne
    @JoinColumn(name="REVIEWER_ID",referencedColumnName="REVIEWER_ID")
    @JsonIgnore
    private Reviewer reviewer;

}
