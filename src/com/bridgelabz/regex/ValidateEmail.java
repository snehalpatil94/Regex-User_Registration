package com.bridgelabz.regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create Regex pattern that should clear given email samples
 * 
 * @author : Snehal Patil
 *
 */
public class ValidateEmail {
	public static void main(String[] args) {
		System.out.println("---------------- Welcome to User Registration Program -------------------");
		System.out.println();

		ArrayList<String> emailSamples = new ArrayList<>();

		// Valid email samples
		emailSamples.add("abc@yahoo.com");
		emailSamples.add("abc-100@yahoo.com");
		emailSamples.add("abc.100@yahoo.com");
		emailSamples.add("abc111@abc.com");
		emailSamples.add("abc-100@abc.net");
		emailSamples.add("abc.100@abc.com.au");
		emailSamples.add("abc@1.com");
		emailSamples.add("abc@gmail.com.com");
		emailSamples.add("abc+100@gmail.com");

		// Invalid email samples
		emailSamples.add("abc");
		emailSamples.add("abc..");
		emailSamples.add("abc..@gmail.com");
		emailSamples.add("abc@abc@gmail.com");
		emailSamples.add("abc@.com.my");
		emailSamples.add("abc123@gmail.a");
		emailSamples.add("abc123@.com");
		emailSamples.add("abc123@.com.com");
		emailSamples.add(".abc@abc.com");
		emailSamples.add("abc()*@gmail.com");
		emailSamples.add("abc..2002@gmail.com");
		emailSamples.add("abc.@gmail.com");
		emailSamples.add("abc@abc@gmail.com");
		emailSamples.add("abc@gmail.com.1a");
		emailSamples.add("abc..@gmail.com");
		emailSamples.add("abc@gmail.com.aa.au");

		// For loop and Regex pattern to check valid and invalid Emails of Arraylist
		String regexEmailPattern = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";
		Pattern pattern = Pattern.compile(regexEmailPattern);
		for (String str : emailSamples) {
			Matcher matcher = pattern.matcher(str);
			if (matcher.matches()) {
				System.out.println(" Vaild email: " + str + " : " + matcher.matches());
				System.out.println();
			} else {
				System.out.println(" Invaild email: " + str + " :-> " + matcher.matches());
				System.out.println();
			}
		}
	}
}
