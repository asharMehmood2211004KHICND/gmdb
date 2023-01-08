package com.galvanize.gmdb.gmdb.service;

import com.galvanize.gmdb.gmdb.entity.Movie;
import com.galvanize.gmdb.gmdb.entity.Review;

import java.util.List;

public interface ReviewService {

    public Review saveReview(Review review);

    public  void saveReviewList(List<Review> reviewList);

    public List<Review> fetchReviewList();
}
