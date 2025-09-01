package com.uber.UberReviewService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class PassangerReview extends  Review {
    @Column(nullable = false)
    private  String passangerReviewContent;

    @Column(nullable = false)
    private String passangerRating;

}
