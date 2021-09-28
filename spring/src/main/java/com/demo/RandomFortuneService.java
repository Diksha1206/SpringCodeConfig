package com.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{


    private String data[] = {"Beware of the wolfs in sheep's clothing", "Deligence is the mother of good luck", "The journey is the reward"};

    private Random random = new Random();


    @Override
    public String getDailyFortune() {        
        int index = random.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }    
}
