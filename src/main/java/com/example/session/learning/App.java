package com.example.session.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

		System.out.println("This application creates a mysql container, and provides APIs to interact with it");

	}

}
