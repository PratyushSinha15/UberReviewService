package com.uber.UberReviewService.repositories;


//this repository layer communicates with our database

import com.uber.UberReviewService.models.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//this layer implements JPA Repository to get the predefined methods
public interface ReviewRepository extends JpaRepository<Review,Long> {

}
