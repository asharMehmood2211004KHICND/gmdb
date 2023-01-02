package com.galvanize.gmdb.gmdb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Review {

    @Id
    private long reviewId;
    private String reviewText;

    @ManyToOne
    @JoinColumn(name="movie_id")
    private Movie movie;
    
}
