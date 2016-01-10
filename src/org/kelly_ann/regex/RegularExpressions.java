package org.kelly_ann.regex;

import java.util.Scanner;

public class RegularExpressions {
	
	public static void main(String[] args) {
		
		boolean flag = false;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		// can contain all letters from a-z (uppercase or lowercase) and digits (0-9)
		do {
			// the regex "+" sign means that it must match 1 or more times (i.e must have at least 1 char of input)
			String passwordPattern = "\\w+";
			System.out.println("Enter your password: ");
			String password = sc.next();
			flag = password.matches(passwordPattern);
			if(!flag)
				System.out.println("Invalid. Please enter a valid password.\n");
			if(flag)
				System.out.println("Valid password!");
		}
		while (!flag);
		
		// must provide a 5 digit number pre-pended with the text "ID" (case-sensitive)
//		do {
//			String idPattern = "ID\\d{5}"; 
//			System.out.println("Enter your ID: ");
//			String id = sc.next();
//			flag = id.matches(idPattern);
//			if(!flag)
//				System.out.println("Please enter a valid ID.\n");
//			if(flag)
//				System.out.println("Valid ID!");
//		}
//		while (!flag);
		
		// must provide at least 1 but a max of 3 digits
//		do {
//			String agePattern = "\\d{1,3}"; 
//			System.out.println("Enter your age: ");
//			String age = sc.next();
//			flag = age.matches(agePattern);
//			if(!flag)
//				System.out.println("Please enter a valid age.\n");
//			if(flag)
//				System.out.println("Valid age!");
//		}
//		while (!flag);
		
		// must provide a 4 digits
//		do {
//			String yearPattern = "\\d{4}"; 
//			System.out.println("Enter the current 4 digit year: ");
//			String year = sc.next();
//			flag = year.matches(yearPattern);
//			if(!flag)
//				System.out.println("Please enter a valid year.\n");
//			if(flag)
//				System.out.println("Valid year!");
//		}
//		while (!flag);
		
		
		// must provide single digit from 0-9 = "\d"
//		do {
//			String digit = "\\d"; 
//			System.out.println("What is your version of Java?");
//			String version = sc.next();
//			flag = version.matches(digit);
//			if(!flag)
//				System.out.println("Please enter a number.\n");
//			if(flag)
//				System.out.println("Valid data!");
//		}
//		while (!flag);
	}
	
}
