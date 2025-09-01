package com.uber.UberReviewService.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="booking_review")
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel {


    @Column(nullable = false)
    private String content;

    private Double rating;

    @Override
    public String toString(){
        return "Review :"+ this.content + " with Rating: "+this.rating+  ""+ this.createdAt;
    }
}
// this model layer is just a view of our database