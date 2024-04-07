package com.ganesh.SubProject.service;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.opencsv.CSVWriter;

public class CSVCheck {

	ResultSet resultSet;
	public void check() throws SQLException {
		FileWriter fileWriter;
		try {
			System.out.println("inside CSVCheck service class...");
			fileWriter = new FileWriter("C:\\Users\\hp\\Desktop\\P\\Open-csv");
			CSVWriter csvWriter = new CSVWriter(fileWriter);

			ResultSetMetaData metaData = resultSet.getMetaData();
//			resultSet.se
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
