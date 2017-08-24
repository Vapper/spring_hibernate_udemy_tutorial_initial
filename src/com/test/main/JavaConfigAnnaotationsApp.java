package com.test.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.coaches.Coach;
import com.test.config.AppConfig;

public class JavaConfigAnnaotationsApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
