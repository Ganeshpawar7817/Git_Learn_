package com.ganesh.SubProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.SubProject.service.Test3;

@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired
	Test3 test3;
	
	@GetMapping("/test-1")
	void test1() {
		test3.m1();
	}

}