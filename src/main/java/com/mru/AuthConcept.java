package com.mru;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthConcept {
	
	
	@GetMapping("/login")
	String login() {
		return "Login Successfully";
	}
	
	@GetMapping("/register")
	String register() {
		return "Register";
	}

}
