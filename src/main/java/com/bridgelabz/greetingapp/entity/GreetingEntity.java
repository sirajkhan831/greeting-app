package com.bridgelabz.greetingapp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "greeting")
@Data
public class GreetingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String message;
}