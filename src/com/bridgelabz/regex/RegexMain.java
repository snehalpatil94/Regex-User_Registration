package com.bridgelabz.regex;

import java.util.Scanner;

/**
 * Validate Mobile number : As a User need to follow pre-defined Mobile Format
 * Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10
 * digit number
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
	}
}
