package com.test.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DangerousFortuneService implements FortuneService {
	
	@Value("${file.fortunes}") 
	private String filename;
	private String[] fortuneTexts;
	
//	public DangerousFortuneService(@Value("${file.fortunes}") String filename) {
//		this.fortuneTexts = readFileContentToStringArray(filename);
//	}
	
	@PostConstruct
	public void startUp(){
		this.fortuneTexts = readFileContentToStringArray(filename);
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Destroying DangerousFortunesBean");
	}

	public String getFortune() {
		return fortuneTexts[new Random().nextInt(fortuneTexts.length)];
	}
	
	private String[] readFileContentToStringArray(String fortuneFileName){
		try(BufferedReader br = new BufferedReader(new FileReader(fortuneFileName))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
		    while (line != null) {
		        sb.append(line+";");
		        line = br.readLine();
		    }
		    return sb.toString().split(";");
		} catch (IOException e) {
			System.out.println("Failed to read file -> " + e);
			return new String[]{""};
		}
	}
}
