package com.bridgelabz.regex;

import java.util.Scanner;

/**
 * Valid Last Name - Last name starts with Cap and has minimum 3 characters
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

		// Method call to validate user first name
		validate.validateFirstName("Snehal");
		validate.validateFirstName("snehal");

		System.out.println("Enter First name: ");
		String firstName = sc.nextLine();
		validate.validateFirstName(firstName);

		// Method call to validate user last name
		validate.validateLastName("Patil");
		validate.validateLastName("patil");

		System.out.println("Enter Last name: ");
		String lastName = sc.nextLine();
		validate.validateFirstName(lastName);
	}
}
