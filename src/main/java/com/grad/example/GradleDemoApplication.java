package com.grad.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradleDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleDemoApplication.class, args);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Gradle Demo called : " + i);
		}
	}
}
