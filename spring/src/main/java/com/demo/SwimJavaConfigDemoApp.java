package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfigForBean.class);        
        Coach theCoach = context.getBean("swimCoach", Coach.class);
        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(swimCoach.getEmail());
        System.out.println(swimCoach.getTeam());
        context.close();        
    }    
}
