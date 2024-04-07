package com.ganesh.SubProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import core_java.java_8.LoggingCheck;

@SpringBootApplication
public class SubProjectApplication {

	public static void main(String[] args) {
		System.err.println("main method strats..!!!!");
		SpringApplication.run(SubProjectApplication.class, args);
		System.err.println("main method ends..!!!!");
		
		LoggingCheck.main(args);
	}

}
