package com.galvanize.gmdb.gmdb.controller;

import com.galvanize.gmdb.gmdb.entity.Movie;
import com.galvanize.gmdb.gmdb.entity.Reviewer;
import com.galvanize.gmdb.gmdb.repository.ReviewerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/reviewers")
public class ReviewerController {

    @Autowired
    ReviewerRepository reviewerRepository;
    @PostMapping("")
    public void saveMovie(@RequestBody Reviewer reviewer){
        //reviewService.saveReviewList(movie.getReviewList());
        reviewerRepository.save(reviewer);

    }


    @GetMapping("")
    public List<Reviewer> fetchMovieList(){
        return  reviewerRepository.findAll();
    }

}
