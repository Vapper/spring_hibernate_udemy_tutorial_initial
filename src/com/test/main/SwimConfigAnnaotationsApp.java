package com.test.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.coaches.Coach;
import com.test.coaches.SwimCoach;
import com.test.config.AppConfig;

public class SwimConfigAnnaotationsApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getTeam());
		
		context.close();
	}

}
