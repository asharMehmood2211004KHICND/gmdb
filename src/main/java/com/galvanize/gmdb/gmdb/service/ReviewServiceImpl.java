package com.galvanize.gmdb.gmdb.service;

import com.galvanize.gmdb.gmdb.entity.Review;
import com.galvanize.gmdb.gmdb.repository.MovieRepository;
import com.galvanize.gmdb.gmdb.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ReviewServiceImpl implements ReviewService{


    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public Review saveReview(Review review) {
        return  reviewRepository.save(review);
    }
}
