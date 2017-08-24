package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.test.coaches.Coach;
import com.test.coaches.SwimCoach;
import com.test.services.FortuneService;
import com.test.services.SadFortuneService;

@Configuration
//@ComponentScan("com.test")
@PropertySource("classpath:value.properties")
public class AppConfig {
	
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach(){
		return new SwimCoach( sadFortuneService());
	}
	
}
