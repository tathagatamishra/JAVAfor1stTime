package com.mycourses.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoursesApplication implements CommandLineRunner
// implements CommandLineRunner to give output in terminal
{

	public static void main(String[] args) {
		SpringApplication.run(CoursesApplication.class, args);
	}

	// private PaymentService payment = new PaymentService();
	// no need to use new, because I created bean of PaymentService class
	// bean is just an object
	// @Autowired
	// private final PaymentService payment;
	private final PaymentInterface payment;

	// constructor dependency injection
	// or I can just use @Autowired 
	// and I don't even need to create this constructor
	// but @Autowired is shit, it wont let use final
	// public CoursesApplication(PaymentService payment) {
	public CoursesApplication(PaymentInterface payment) {
		this.payment = payment;
	}

	// run method comes from CommandLineRunner
	@Override
	public void run(String... args) throws Exception {
		String pay = payment.pay();
		System.out.println("Payment done: " + pay);
	}

}
