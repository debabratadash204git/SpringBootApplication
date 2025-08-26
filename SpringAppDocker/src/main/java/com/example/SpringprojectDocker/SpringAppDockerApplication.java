package com.example.SpringprojectDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAppDockerApplication {
	
	@GetMapping("/messages")
	public String getMessage() {
		return "Rest Controller get message method";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAppDockerApplication.class, args);
	}

}
