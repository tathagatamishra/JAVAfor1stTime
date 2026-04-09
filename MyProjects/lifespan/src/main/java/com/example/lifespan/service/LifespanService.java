package com.example.lifespan.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class LifespanService {

    public Map<String, Object> calculate(String dob, int expectedYears) {
        LocalDate birthDate   = LocalDate.parse(dob);
        LocalDate today       = LocalDate.now();
        LocalDate expectedEnd = birthDate.plusYears(expectedYears);

        if (birthDate.isAfter(today)) {
            throw new IllegalArgumentException("Date of birth cannot be in the future.");
        }
        if (expectedYears <= 0) {
            throw new IllegalArgumentException("Expected years must be a positive number.");
        }

        // Age
        Period age = Period.between(birthDate, today);

        // Days
        long totalExpectedDays = ChronoUnit.DAYS.between(birthDate, expectedEnd);
        long daysSpent         = ChronoUnit.DAYS.between(birthDate, today);
        long daysRemaining     = totalExpectedDays - daysSpent;

        // Percentage
        double percentageLived    = ((double) daysSpent / totalExpectedDays) * 100;
        double percentageRemaning = 100 - percentageLived;

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("dateOfBirth", dob);
        result.put("today", today.toString());
        result.put("age", String.format("%d years, %d months, %d days",
                age.getYears(), age.getMonths(), age.getDays()));
        result.put("expectedLifespan", expectedYears + " years");
        result.put("expectedEndDate", expectedEnd.toString());
        result.put("totalExpectedDays", totalExpectedDays);
        result.put("daysSpent", daysSpent);
        result.put("daysRemaining", daysRemaining > 0 ? daysRemaining : 0);
        result.put("percentageLived", String.format("%.2f%%", percentageLived));
        result.put("percentageRemaining", String.format("%.2f%%", percentageRemaning));
        result.put("funFact", getFunFact(daysSpent));

        return result;
    }

    private String getFunFact(long daysSpent) {
        if (daysSpent < 3650)  return "Hey kid go home, nothing to see here!";
        if (daysSpent < 7300)  return "You're a teenager of days!";
        if (daysSpent < 10950) return "You're hitting your stride!";
        if (daysSpent < 14600) return "You've aura bro!";
        if (daysSpent < 18250) return "Unk!";
        if (daysSpent < 21900) return "Rip Bozo";
        return "You are a GigaChad!";
    }
}