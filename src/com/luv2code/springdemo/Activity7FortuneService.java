package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Activity7FortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Do Activity #7";
    }
}
