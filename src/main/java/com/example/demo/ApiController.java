package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@GetMapping("hi")
	public String getName() {
		String Ename="gaja";
		return "Welcome "+Ename+"!";
	}
}
