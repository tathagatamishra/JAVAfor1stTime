package com.mycourses.courses;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "cash")
public class PaymentService2 implements PaymentInterface{

    @Override
    public String pay() {
        String payment = "Cash Payment";
        System.out.println("Payment from: " + payment);
        return payment;
    }
    
}
