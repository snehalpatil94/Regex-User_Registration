package com.bridgelabz.regex;

public class ValidateUserRegistration {

	// Method to validate user first name
	public boolean validateFirstName(String name) {
		String pattern = "^[A-Z]{1}[a-z,A-Z]{2,}$";

		if (name.matches(pattern)) {
			System.out.println("'" + name + "'" + " is Valid First Name !");
			System.out.println("-------------------------------------------------------------------------");
			return true;
		} else {
			System.out.println("'" + name + "'" + " is Invalid First Name !");
			System.out.println();
			System.out.println("First name should starts with Capital letter and has minimum 3 characters");
			System.out.println("-------------------------------------------------------------------------");
			return false;
		}
	}

	// Method to validate user last name
	public boolean validateLastName(String name) {
		String pattern = "^[A-Z]{1}[a-zA-Z]{2,}$";

		if (name.matches(pattern)) {
			System.out.println("'" + name + "'" + " is Valid Last Name !");
			System.out.println("-------------------------------------------------------------------------");
			return true;
		} else {
			System.out.println("'" + name + "'" + " is Invalid Last Name !");
			System.out.println();
			System.out.println("Last name should starts with Capital letter and has minimum 3 characters");
			System.out.println("------------------------------------------------------------------------");
			return false;
		}
	}

	// Method to validate Email Id
	public boolean validatEmail(String name) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9]{1}|[a-zA-Z]{2,5})\\.)+[a-zA-Z]{2,3}";
		if (name.matches(regex)) {
			System.out.println("Email Id is Valid !");
			System.out.println("------------------------------------------------------------------------");
			return true;
		} else {
			System.out.println("Email Id is Invalid !");
			System.out.println("------------------------------------------------------------------------");
			return false;
		}
	}

	// Method to validate Mobile number
	public void validateMobileNum(String mobNumber) {
		// pattern
		String mobNumberPattern = "[0-9]{2}[\s][0-9]{10}";
		if (mobNumber.matches(mobNumberPattern)) { // check Input and Pattern
			System.out.println("'" + mobNumber + "'" + " is valid Mobile Number !");
			System.out.println("------------------------------------------------------------------------");
		} else {
			System.out.println("'" + mobNumber + "'" + " is Invalid Mobile Number !");
			System.out.println();
			System.out.println("Country code follow by space and 10 digit number ");
			System.out.println("------------------------------------------------------------------------");
		}
	}

	public void validatePassword(String password) {
		String passwordRegex = "[0-9a-zA-Z!@#$%^&*_.+-]{8,20}";
		if (password.matches(passwordRegex)) { // check Input and Pattern
			System.out.println("'" + password + "'" + " is valid Password !");
			System.out.println("-----------------------------------------------------------------------");
		} else {
			System.out.println("'" + password + "'" + " is Invalid Password !");
			System.out.println("\n1. Minimum 8 charatcers ");
			System.out.println("-----------------------------------------------------------------------");
		}
	}
}
