package com.example.lifespan.model;

public class LifespanRequest {

    // declaring private variables
    private String dateOfBirth; // "YYYY-MM-DD"
    private int expectedYears;

    // function that return dateOfBirth variable
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    
    // function that take dateOfBirth as argument
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getExpectedYears() {
        return expectedYears;
    }

    public void setExpectedYears(int expectedYears) {
        this.expectedYears = expectedYears;
    }
}