package com.uber.UberReviewService.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@EntityListeners(AuditingEntityListener.class)// This enables auditing for this entity meaning giving auto date and time
@MappedSuperclass //We want to use inheritance In our ReviewClass, Our review class Inherit The basemodel class @MappedSuperclass annotation Helps us Achieve inheritance
//Map super class That there should not be any table of super class that is base model but the child class should have a table containing the properties of base model that is parent class as well as child class model
public abstract class BaseModel {
    @Id // this annottation make the id as primary key of our review table
    @GeneratedValue(strategy = GenerationType.IDENTITY) //identity means auto increment
    protected Long id;

    @Column(updatable = false)
    @CreatedDate // will be auto set only once at creation
    protected Date createdAt;

    @Column(updatable = false)
    @LastModifiedDate
    protected Date updatedAt;
}
