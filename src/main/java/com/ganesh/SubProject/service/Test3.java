package com.ganesh.SubProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Test3 {
	
	Test test;
	Test2 test2;
	@Autowired
	public Test3(Test test) {
		this.test = test;
//		this.test2 = test2;
	}

	@Autowired
	void setTest2(Test test, Test2 test2) {
		System.out.println("inside constructor inject of Test3");
		this.test = test;
		this.test2 = test2;
	}
	
	public void m1() {
		System.out.println("inside m1 method of Test3");
		System.out.println("inside m1 method of Test3");
		test.m1();
		test2.m1();
		System.out.println("m1-Test3 is called");
	}
}
