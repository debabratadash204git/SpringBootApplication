package com.example.Springproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstApi")
public class FirstController {
	@GetMapping("/index")
	public String index() {
		return "My First Application";
	}

@GetMapping("/{name}/{age}")
public String insert(@PathVariable("name") String name, @PathVariable("age") int age) {

		System.out.println(name);
		System.out.println(age);
		return "Hello, " + name + "! You are " + age + " years old.";
	}
}