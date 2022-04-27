package com.bridgelabz.regex;

import java.util.Scanner;

/**
 * Validate Password : As a User need to follow pre-defined Password rules.
 * Rule2 – Should have at least 1 Upper Case
 * 
 * @author : Snehal Patil
 *
 */
public class RegexMain {

	public static void main(String[] args) {
		System.out.println("-------------Welcome message to user registration program ---------------");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		// Create object of ValidateUserRegistration class
		ValidateUserRegistration validate = new ValidateUserRegistration();

		// Method call to validate user First name
		validate.validateFirstName("Snehal");
		validate.validateFirstName("snehal");

		// Method call to validate user Last name
		validate.validateLastName("Patil");
		validate.validateLastName("patil");

		// Method call to validate Email id
		validate.validatEmail("abc.xyz@bl.co.in");
		validate.validatEmail("abc_10@yahoo");
		validate.validatEmail("abc@abc@gmail.com");

		// Method call to validate Mobile no
		validate.validateMobileNum("91 1234567890");
		validate.validateMobileNum("91 123456789");
		validate.validateMobileNum("911234567890");

		// Method call to validate Password
		validate.validatePassword("password");
		validate.validatePassword("Password");
		validate.validatePassword("Eight");
		validate.validatePassword("PASSWORD");

	}
}
