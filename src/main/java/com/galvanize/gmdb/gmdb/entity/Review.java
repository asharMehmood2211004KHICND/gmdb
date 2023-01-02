package com.galvanize.gmdb.gmdb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Review {

    @Id
    private long reviewId;
    private String reviewText;
    
    
}
