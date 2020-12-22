package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class JenkinsApplication {

	@GetMapping
	public String applicationStatus() {
		return "Application is up & running!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}
	
	@GetMapping("/test")
	public String test() {
		return "Test application successful!!";
	}
}
