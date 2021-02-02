package com.nyala.webapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Value("${lucky-word}")
	String luckyWord;
	
	//@Value("${env}")
	String environmnent;

	@GetMapping("/lucky-word")
	public String showLuckyWord() {
		return "The lucky word is: " + luckyWord;
	}
	
	@GetMapping("/env")
	public String showEnv() {
		return "The Env is: " + environmnent;
	}
}
