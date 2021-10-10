package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

// Practice Activity #4 - Inversion of Control with Annotations
@Component
public class JavaCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Java";
    }
}
