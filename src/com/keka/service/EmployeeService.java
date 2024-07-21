package com.keka.service;

public interface EmployeeService {

	public String employeeEmailGenerator(String firstName, String lastName, String department);
	public String employeePasswordGenerator();
	public void displayEmployeeDetails(String firstName, String lastName, String email, String password);
}
