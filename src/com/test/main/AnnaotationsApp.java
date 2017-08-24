package com.test.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.coaches.Coach;

public class AnnaotationsApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("boxingCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
