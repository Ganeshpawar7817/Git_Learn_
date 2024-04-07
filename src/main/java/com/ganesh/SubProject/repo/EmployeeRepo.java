package com.ganesh.SubProject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ganesh.SubProject.entity.Employee;

import jakarta.persistence.NamedNativeQuery;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	@Query(value = "SELECT id as emp_id, experience as emp_exp, company_name as com_name, job as emp_job from employee where id <100", nativeQuery = true)
	public List<Employee> findAll();

}
