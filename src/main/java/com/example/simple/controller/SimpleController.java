package com.example.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping("/hello")
	public String getMessage() {
		
		return "Welcome to my Simple Application";
	}
	

}