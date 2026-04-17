package com.mycourses.courses;

import org.springframework.stereotype.Component;

@Component
// Component works as a tag
// those who have Component annotation
// spring will create beans of them
// bean is just an object
public class PaymentService {
    
    public String pay() {

        String payment = "UPI Payment";
        System.out.println("Payment from: " + payment);
        return payment;
    }

}
