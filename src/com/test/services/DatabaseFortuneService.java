package com.test.services;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	public String getFortune() {
		return "Database Fortunes!";
	}

}
