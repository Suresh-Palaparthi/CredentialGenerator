package com.keka.app;

import java.util.Scanner;

import com.keka.model.Employee;
import com.keka.service.EmployeeServiceImpl;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first name of the employee");
		
		String fName = sc.next();
		System.out.println("Enter the last name of the employee");
		String lName = sc.next();
		
		Employee employee = new Employee();
		
		employee.setFirstName(fName);
		employee.setLastName(lName);
		
		EmployeeServiceImpl esi = new EmployeeServiceImpl();
		
		System.out.println("Select employee department.");
		System.out.println("1.Technical");
		System.out.println("2. Admin");
		System.out.println("3. Hr");
		System.out.println("4. Legal");
		
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1: employee.setEmployeeEmail(esi.employeeEmailGenerator(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "tech"));
				break;
		case 2: employee.setEmployeeEmail(esi.employeeEmailGenerator(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "admin"));
				break;
		case 3: employee.setEmployeeEmail(esi.employeeEmailGenerator(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "hr"));
				break;	
		case 4: employee.setEmployeeEmail(esi.employeeEmailGenerator(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "legal"));
				break;
		default: System.out.println("Enter a valid department name");
		}
		
		employee.setEmployeePassword(esi.employeePasswordGenerator());
		esi.displayEmployeeDetails(employee.getFirstName(), employee.getLastName(), employee.getEmployeeEmail(), employee.getEmployeePassword());
	}
}
