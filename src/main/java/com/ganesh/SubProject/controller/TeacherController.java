package com.ganesh.SubProject.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.SubProject.entity.Employee;
import com.ganesh.SubProject.repo.EmployeeRepo;
import com.opencsv.CSVWriter;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	@Autowired
	EmployeeRepo employeeRepo;

	@GetMapping("/get-all")
	public void check() throws SQLException, IOException {
		System.out.println("inside teacher/get-all api");
		List<Employee> employees = getData();
		employeeRepo.saveAll(employees);
		ResultSet resultSet = fetchData();
		writeData(resultSet);
	}

	public void writeData(ResultSet resultSet) throws SQLException, IOException {
		ResultSetMetaData metaData = resultSet.getMetaData();
		String[] headers = new String[metaData.getColumnCount()];
		for(int i=1; i<= metaData.getColumnCount(); i++) {
//			System.out.println(metaData.getColumnName(i)+","+metaData.getColumnLabel(i));
			headers[i-1] = metaData.getColumnLabel(i);
		}
		System.out.println(metaData.getColumnCount());
		CSVWriter csvWriter = new CSVWriter(new FileWriter("C:\\Users\\hp\\Desktop\\P\\Open-csv\\csv1.csv", true));
		csvWriter.writeNext(headers);
		csvWriter.writeAll(resultSet, false);
//		while (resultSet.next()){
//			System.out.println(resultSet.getObject(1)+","+resultSet.getObject(2)+","+resultSet.getObject(3)+","+resultSet.getObject(4));
//		}
		csvWriter.flush();
		csvWriter.close();
		
		System.out.println("after resultset");
	}
	public ResultSet fetchData() {
		ResultSet resultSet = null;
		try {
			String query = "SELECT id as emp_id, experience as emp_exp, company_name as com_name, job as emp_job from employee;";
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/checks_errors?user=root&password=tiger");
			Statement statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resultSet;
	}

	public List<Employee> getData() {
		List<Employee> employees = new ArrayList<>();
		Employee employee = null;
		for (int i = 1; i <= 1000; i++) {
			employee = new Employee();
			employee.setCompany_name("abc" + i);
			employee.setExperience(i + 25);
			employee.setJob("job" + i);
			employees.add(employee);
		}
		return employees;
	}

}
