package com.bridgelabz.regex;

import java.util.Scanner;

/**
 * Validate Email Id : As a User need to enter Email has 3 mandatory parts (abc,
 * bl & co) and 2 optional (xyz & in) with precise @ and . positions Ex.
 * abc.xyz@bl.co.in
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

		// Method call to validate user first name
		validate.validateFirstName("Snehal");
		validate.validateFirstName("snehal");

		// Method call to validate user last name
		validate.validateLastName("Patil");
		validate.validateLastName("patil");

		// Method call to validate email id
		validate.validatEmail("abc.xyz@bl.co.in");
		validate.validatEmail("abc_10@yahoo");
		validate.validatEmail("abc@yahoo.");
	}
}
