package com.test.services;

import org.springframework.stereotype.Component;

@Component("restFortuneService")
public class RESTFortuneService implements FortuneService {

	public String getFortune() {
		return "REST REST for you!";
	}

}
