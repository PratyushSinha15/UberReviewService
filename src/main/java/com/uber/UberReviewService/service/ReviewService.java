package com.uber.UberReviewService.service;

import com.uber.UberReviewService.models.Booking;
import com.uber.UberReviewService.models.Review;
import com.uber.UberReviewService.repositories.BookingRepository;
import com.uber.UberReviewService.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    private final ReviewRepository reviewRepository;
    private final BookingRepository bookingRepository;

    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository){
        this.reviewRepository=reviewRepository;
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("Inside service Layer which will interact with repository layer to save stuff to db");
        //code to create a POJO before savng in db
//        Review r= Review.builder()
//                .content("Well its working good")
//                .rating(8.8)
//                .build();
//        Booking b= Booking
//                .builder()
//                .startDate(new Date())
//                .review(r)
//                .endDate(new Date())
//                .build();
//        System.out.println("Review : "+r);
//        System.out.println("Booking : "+b);
//        bookingRepository.save(b);



//        reviewRepository.deleteById(2L);
        Optional<Booking> b=bookingRepository.findById(6L);
        if(b.isPresent()){
            bookingRepository.delete(b.get());
        }
        List<Review> reviews= reviewRepository.findAll();
        for(Review review: reviews){
            System.out.println(review.getContent());
        }

    }
}
