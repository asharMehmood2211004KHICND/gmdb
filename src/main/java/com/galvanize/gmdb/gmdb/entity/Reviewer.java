package com.galvanize.gmdb.gmdb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter

public class Reviewer {

    @Id
    @Column(name = "REVIEWER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reviewerId;
    private String userName;

    private Date dateJoined;

    private int reviewCount;




    @OneToMany( mappedBy = "reviewer",targetEntity=Review.class,cascade = CascadeType.ALL
    )
    //    @OneToMany(mappedBy="movie",targetEntity=Review.class)
//    @JoinColumn(name = "movie_review_fk",referencedColumnName = "movieId")
    //@JsonIgnore                                                        //mappedBy="movie"
    private List<Review> reviews;




    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public Reviewer(Long reviewerId, String userName, Date dateJoined, int reviewCount, List<Review> reviews) {
        this.reviewerId = reviewerId;
        this.userName = userName;
        this.dateJoined = dateJoined;
        this.reviewCount = reviewCount;
        this.reviews = reviews;
    }

    public Reviewer() {
    }
}
