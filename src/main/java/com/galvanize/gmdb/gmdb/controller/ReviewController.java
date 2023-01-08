package com.galvanize.gmdb.gmdb.controller;


import com.galvanize.gmdb.gmdb.entity.Movie;
import com.galvanize.gmdb.gmdb.entity.Review;
import com.galvanize.gmdb.gmdb.service.MovieService;
import com.galvanize.gmdb.gmdb.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("")
    public Review saveReview(@RequestBody Review review){
        return reviewService.saveReview(review);

    }

    @GetMapping("")
    public List<Review> fetchMovieList(){
        return  reviewService.fetchReviewList();
    }


}
