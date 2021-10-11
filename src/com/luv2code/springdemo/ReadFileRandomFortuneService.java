package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ReadFileRandomFortuneService implements FortuneService {

    @Value("${foo.fortunes}")
    private String[] fortunes;

    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(fortunes.length);

        return fortunes[index];
    }
}
