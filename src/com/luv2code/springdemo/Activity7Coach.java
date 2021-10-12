package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Activity7Coach implements Coach {

    @Autowired
    @Qualifier("activity7FortuneService")
    private FortuneService fortuneService;

    public Activity7Coach() {
        System.out.println(">> Activity7Coach: Inside the Constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Activity 7 Workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
