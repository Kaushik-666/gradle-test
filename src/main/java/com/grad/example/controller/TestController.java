package com.grad.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/")
	public String getStringData() {
		return "Hello World";
	}

}
