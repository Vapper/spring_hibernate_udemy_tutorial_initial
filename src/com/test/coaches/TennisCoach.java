package com.test.coaches;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.test.services.FortuneService;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("restFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach(){
		System.out.println(">>Inside Default Constructor");
	}
	
	@PostConstruct
	public void startUp(){
		System.out.println("Inside TenniCoach startUp");
	}
	
	@PreDestroy
	public void destroyDown() {
		System.out.println("Inside TennisCoach destroyDown");
	}
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void methodInjection(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}



	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getDailyWorkout() {
		return "Serve 100 times";
	}
	
}
