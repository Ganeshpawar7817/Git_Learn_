package com.ganesh.SubProject.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ganesh.SubProject.repo.EmployeeRepo;

@Repository
public class EmployeeDao {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	

}
