package com.example.hello.models;

import jakarta.persistence.*;

@Entity
@Table(name = "greetings")
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;

    public Greeting() {
    }

    public Greeting(long id, String message) {
        this.id = id;
        this.message = message;

    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

