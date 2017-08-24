package com.test.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.coaches.Coach;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach1 = context.getBean("tennisCoach", Coach.class);
		
		Coach coach2 = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(coach1 == coach2);
		
		context.close();
	}

}
