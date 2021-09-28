package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService theFortuneService;

    public CricketCoach(){
        
    }

    @Override
    public String getDailyWorkout() {        
        return "Practice batting and bowling";
    }


    @Override
    public String getDailyFortune() {        
        return theFortuneService.getDailyFortune();
    }
    
}
