package com.pa.ma;

import java.util.Scanner;

public class SwitchString {
	public static void main(String[] args) {
		String week;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the any day::");
		week=s.nextLine();
		
		switch (week) 
		{
			case "Sunday":
			System.out.print("your day::");
			System.out.println("sunday");
			break;
			
			case "Monday":
				System.out.print("your day::");
			System.out.println("Monday");
			break;
			
			case "Tuesday":
				System.out.print("your day::");
			System.out.println("Tuesday");
			break;
			
			case "Wednesday":
				System.out.print("your day::");
			System.out.println("Wednesday");
			break;
			
			case "Thrusday":
				System.out.print("your day::");
				System.out.println("Thrusday");
				break;
				
			case "Friday":
				System.out.print("your day::");
				System.out.println("Friday");
				break;
				
			case "Saturday":
				System.out.print("your day::");
				System.out.println("Saturday");
				break;
		}
		
	}

	
}
