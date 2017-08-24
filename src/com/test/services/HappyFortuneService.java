package com.test.services;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		return "Today is gonna be your lucky day, punk!";
	}


}
