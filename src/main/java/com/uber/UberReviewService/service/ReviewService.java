package com.uber.UberReviewService.service;

import com.uber.UberReviewService.models.Review;
import com.uber.UberReviewService.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository=reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("Inside service Layer which will interact with repository layer to save stuff to db");
        //code to create a POJO before savng in db
//        Review r= Review.builder()
//                .content("Well its working good")
//                .rating(8.8)
//                .build();
//        System.out.println(r);
//        reviewRepository.save(r);
//        List<Review> reviews= reviewRepository.findAll();
//        for(Review review: reviews){
//            System.out.println(review.getContent());
//        }
        reviewRepository.deleteById(2L);
        List<Review> reviews= reviewRepository.findAll();
        for(Review review: reviews){
            System.out.println(review.getContent());
        }

    }
}
