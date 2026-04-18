package com.mycourses.courses;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "upi")
// Component works as a tag
// those who have Component annotation
// spring will create beans of them
// bean is just an object
public class PaymentService implements PaymentInterface{
    
    @Override
    public String pay() {

        String payment = "UPI Payment";
        System.out.println("Payment from: " + payment);
        return payment;
    }

}
