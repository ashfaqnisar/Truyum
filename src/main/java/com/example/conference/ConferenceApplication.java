package com.example.conference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication //To make the application run as a spring boot
public class ConferenceApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ConferenceApplication.class, args);
    }
}
// Controller - Just handles the request, based on the request sends it to the service, or routes the jsp
// Service - This contains the business logic to manage the data from the backend  and handle when there is no data
// Repository - The repository contains the code to just fetch the data doesnt has any sort of exceptions.

/*
 * Controller:
 * Handles the request
 * Handles the response type or  view output
 * interpret the exceptions and handle them .
*/

// Interceptors: These are the guys who intercept the calls made to the server and change them base on the required
// stuff


