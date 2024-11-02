package com.example.WearchWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WearchWebApplication {

	@RequestMapping("/")
	String home() {
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(WearchWebApplication.class, args);
	}

}
