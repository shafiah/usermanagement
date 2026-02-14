package com.example.usermanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@GetMapping("/home")
	public String home() {
		return "welcome to home page";
	}
	
	@GetMapping("/list")
	public String userList() {
		return "welcome to list page";
	}
	
	@GetMapping("/singleuser")
	public String singleUser() {
		return "welcome to single user details";
	}
	
	@GetMapping("/health")
	public String awsHealth() {
		return "application is running n active";
	}
	
	
}
