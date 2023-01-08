package com.galvanize.gmdb.gmdb.entity;

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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reviewId;
    private String reviewText;

    @ManyToOne
    @JoinColumn(name = "movie_movie_id")
    private Movie movie;

}
