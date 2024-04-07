package com.ganesh.SubProject.service;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class CommandLineRunnerEg implements ApplicationRunner{

	
	public void run(String... args) throws Exception {
		System.err.println("here is command line runner....");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.err.println("here is application runner....");
		// TODO Auto-generated method stub
		
	}

}
