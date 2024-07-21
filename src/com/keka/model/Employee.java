package com.keka.model;

public class Employee {
// A plain old Java object (POJO) is a class definition that is not tied to any Java framework so any Java program can use it. A POJO has no particular naming convention for properties and methods, or any other special restrictions. Their primary advantage is their reusability and simplicity.
	private String firstName;
	private String lastName;
	private String employeeEmail;
	private String employeePassword;
	
	public Employee() {}
	
	public Employee(String firstName, String lastName, String employeeEmail, String employeePassword) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeEmail = employeeEmail;
		this.employeePassword = employeePassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}
	
}
