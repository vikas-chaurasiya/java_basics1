package com.pa.ma;

import java.util.Scanner;

public class Simple_Interest {
	public static void main(String[] args) {
		float p,r,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principal::");
		p=sc.nextFloat();
		System.out.println("enter the rate of interest::");
		r=sc.nextFloat();
		System.out.println("enter the time period::");
		s=sc.nextFloat();
		float si;
		si=(p*r*s)/100;
		System.out.println("result::"+si);
	}
}
