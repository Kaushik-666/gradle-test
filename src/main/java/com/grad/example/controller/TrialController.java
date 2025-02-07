package com.grad.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trial")
public class TestController {

	@GetMapping
	public String getStringData() {
		return "Hello Trial";
	}

	@GetMapping("/{name}")
	public String getUserDetails(@PathVariable("name") String name) {
		return "Hello Trial " + name;
	}

}
