package com.bridgelabz.regex;

import java.util.Scanner;

/**
 * valid First Name - First name starts with Cap and has minimum 3 characters
 * 
 * @author : Snehal Patil
 *
 */
public class RegexMain {

	public static void main(String[] args) {
		System.out.println("-----Welcome message to user registration program------");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		// Create object of ValidateUserRegistration class
		ValidateUserRegistration validate = new ValidateUserRegistration();

		validate.validateFirstName("Snehal");
		
		validate.validateFirstName("snehal");
		
		System.out.println("Enter First name: ");
		String firstName = sc.nextLine();
		// method call to validate user first name
		validate.validateFirstName(firstName);
	}
}
