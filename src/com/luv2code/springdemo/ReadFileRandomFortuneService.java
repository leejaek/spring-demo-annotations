package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ReadFileRandomFortuneService implements FortuneService {

    private String[] fortunes;

    @PostConstruct
    public void initiateReadFileRandomFortuneService() {
        System.out.println(">> ReadFileRandomFortuneService: inside of initiateReadFileRandomFortuneService()");
        String fileName = "/Users/jaehyeoklee/Dropbox/100 Project/spring-demo-annotations/src/fortune.txt";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            List<String> lines = new ArrayList<>();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();
            fortunes = lines.toArray(new String[lines.size()]);

        } catch (IOException e) {
            System.out.println("Unable to create " + fileName + ": " + e.getMessage());
        }
    }

//    @Value("${foo.fortunes}")
//    private String[] fortunes;

    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(fortunes.length);

        return fortunes[index];
    }
}
