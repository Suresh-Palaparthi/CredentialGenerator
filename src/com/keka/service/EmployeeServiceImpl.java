package com.keka.service;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.keka.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String employeeEmailGenerator(String firstName, String lastName, String department) {
		return firstName + lastName + "@" +department +".gmail.com";
	}

	@Override
	public String employeePasswordGenerator() {
		
		Random random = new Random();
		
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String symbols = "!@#$%^&*()";
		String numbers = "1234567890";
		
		String combined = caps + lower + symbols + numbers;
		
		String password =""; 
		
//		while(true) {
			
			for(int i=0; i<8; i++) {
				
				password += String.valueOf(combined.charAt(random.nextInt(combined.length())));
			}
			
//			String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)"+"(?=.*[!@#$%^&*()].+$)";
//			Pattern p = Pattern.compile(regex);
//			Matcher m = p.matcher(password);
//		
//			if(m.matches()) {
//				break;
//			}
//			else {
//				password ="";
//			}
//		}
		return password;
	}	
		
	@Override
	public void displayEmployeeDetails(String firstName, String lastName, String email, String password) {

		
		System.out.println("First Name:" + firstName);
		System.out.println("Last Name:" + lastName);
		
		if(email != null) {
		System.out.println("Email:" +email);
		System.out.println("Password: " +password);
		}
	}


}
