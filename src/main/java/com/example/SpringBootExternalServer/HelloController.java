package com.example.SpringBootExternalServer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public String sayHello() {
		return "Hello!!! I am running on external server";
	}
}
