package com.mru;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloAPI {

	
	@GetMapping("/hello")
	String hello() {
		
		return "Hello MRU";
	}
}
