package com.galvanize.gmdb.gmdb.controller;


import com.galvanize.gmdb.gmdb.entity.Movie;
import com.galvanize.gmdb.gmdb.entity.Review;
import com.galvanize.gmdb.gmdb.entity.Reviewer;
import com.galvanize.gmdb.gmdb.repository.ReviewerRepository;
import com.galvanize.gmdb.gmdb.service.MovieService;
import com.galvanize.gmdb.gmdb.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;



    @Autowired
    private  MovieService movieService;
    @Autowired
    private ReviewerRepository reviewerRepository;

    @PostMapping("")
    public Review saveReview(@RequestBody Review review){
        //movieService.fetchMovieById(review.ge);
        Movie myMovie =  movieService.fetchMovieById(review.getMovie().getMovieId());
//        Optional<Reviewer> myReviewer =  reviewerRepository.findById(review.getReviewer().getReviewerId());
//        review.setReviewer(myReviewer.get());
        review.setMovie(myMovie);
        reviewService.saveReview(review);
        return review;

    }

    @GetMapping("")
    public List<Review> fetchMovieList(){
        return  reviewService.fetchReviewList();
    }


}
