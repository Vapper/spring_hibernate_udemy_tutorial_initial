package com.test.coaches;

import org.springframework.beans.factory.annotation.Value;

import com.test.services.FortuneService;

public class SwimCoach implements Coach {
	
	@Value("${text.team.swim}")
	private String team;
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getTeam() {
		return team;
	}
	
	

}
