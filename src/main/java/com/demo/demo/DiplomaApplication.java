package com.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController


public class DiplomaApplication {

	@GetMapping("/messages")

	public String getMessage() {
		return "Hello from Docker!";
	}
		public static void main (String[] args){
			SpringApplication.run(DiplomaApplication.class, args);
		}
	}

