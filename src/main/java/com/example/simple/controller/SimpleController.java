package com.example.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping("/")
	public String getMessage(){
		return "Hello everyone,Welcome to my Simple Application";

	}
	

}
