package com.test.services;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] randomTexts = {"Random fortune 1", "Random fortune 2", "Random fortune 3"};

	public String getFortune() {
		return randomTexts[new Random().nextInt(randomTexts.length)];
	}

}
