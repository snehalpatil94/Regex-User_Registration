package com.bridgelabz.regex;

public class ValidateUserRegistration {

	// Method to validate user first name
	public boolean validateFirstName(String name) {
		String pattern = "^[A-Z]{1}[a-z,A-Z]{2,}$";
		
		if (name.matches(pattern)) {
			System.out.println("'"+name+ "'" +" is Valid First Name !");
			System.out.println("-------------------------------------");
			return true;
		} else {
			System.out.println("'"+name+ "'" +" is Invalid First Name !");
			System.out.println("---------------------------------------");
			return false;
		}
	}
}
