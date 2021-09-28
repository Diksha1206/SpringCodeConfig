package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public class SwimCoach implements Coach {

    private FortuneService theFortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

  

    public SwimCoach(FortuneService fortuneService){
        this.theFortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {        
        return "Swim 1000 meters as a warm up.";
    }

    @Override
    public String getDailyFortune() {        
        return theFortuneService.getDailyFortune();
    }    
}
