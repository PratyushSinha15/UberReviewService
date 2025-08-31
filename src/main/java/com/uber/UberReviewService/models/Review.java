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
@EntityListeners(AuditingEntityListener.class)// This enables auditing for this entity meaning giving auto date and time
@Table(name="bookingreview")
public class Review {
    @Id // this annottation make the id as primary key of our review table
    @GeneratedValue(strategy = GenerationType.IDENTITY) //identity means auto increment
    private Long id;

    @Column(nullable = false)
    private String content;


    private Double rating;

    @Column(updatable = false)
    @CreatedDate // will be auto set only once at creation
    private Date createdAt;

    @Column(updatable = false)
    @LastModifiedDate
    private Date updatedAt;

    @Override
    public String toString(){
        return "Review :"+ this.content + " with Rating: "+this.rating;
    }
}
// this model layer is just a view of our database