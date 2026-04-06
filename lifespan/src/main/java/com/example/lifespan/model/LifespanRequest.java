package com.example.lifespan.model;

public class LifespanRequest {

    private String dateOfBirth;   // format: "YYYY-MM-DD"
    private int expectedYears;

    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public int getExpectedYears() { return expectedYears; }
    public void setExpectedYears(int expectedYears) { this.expectedYears = expectedYears; }
}