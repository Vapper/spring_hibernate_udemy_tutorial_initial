package com.test.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.coaches.Coach;
import com.test.config.CustomConfig;

public class HockeyCoachTestApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomConfig.class);
		
		Coach hockeyCoach = context.getBean("hockeyCoach", Coach.class);
		
		System.out.println(hockeyCoach.getDailyWorkout());
		System.out.println(hockeyCoach.getDailyFortune());
		
		context.close();
	}

}
