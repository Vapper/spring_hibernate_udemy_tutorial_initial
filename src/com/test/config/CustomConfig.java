package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.coaches.Coach;
import com.test.coaches.HockeyCoach;
import com.test.services.BananaFortuneService;
import com.test.services.FortuneService;

@Configuration
public class CustomConfig {
	
	@Bean
	public Coach hockeyCoach(){
		return new HockeyCoach(bananaFortuneService());
	}
	
	@Bean
	public FortuneService bananaFortuneService(){
		return new BananaFortuneService();
	}
}
