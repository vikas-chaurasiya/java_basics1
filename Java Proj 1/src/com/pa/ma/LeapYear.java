package com.pa.ma;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year::");
		year=s.nextInt();
		if(year % 400==0)
			System.out.println("leap year");
		else if(year% 100==0)
			System.out.println("leap year");
		else if(year% 4==0)
			System.out.println("leap year");
		else
			System.out.println("not leap year");
	}

	
}
