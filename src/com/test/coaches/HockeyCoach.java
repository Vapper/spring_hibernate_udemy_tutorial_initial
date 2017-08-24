package com.test.coaches;

import com.test.services.FortuneService;

public class HockeyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public HockeyCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Backwards skating for 5 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
