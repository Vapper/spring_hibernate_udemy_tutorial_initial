package com.test.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.test.services.FortuneService;

@Component
public class BoxingCoach implements Coach {
	
	@Autowired
	@Qualifier("dangerousFortuneService")
	private FortuneService fortuneService;
	
	@Value("${text.boxing.workout}")
	private String dailyWorkoutText;

	public String getDailyWorkout() {
		return dailyWorkoutText;
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
