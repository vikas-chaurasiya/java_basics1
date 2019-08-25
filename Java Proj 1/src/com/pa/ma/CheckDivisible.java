package com.pa.ma;

import java.util.Scanner;

public class CheckDivisible {
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number::");
		n=s.nextInt();
		if(n%5==0)
			System.out.println(n+ " number is divisible by 5");
		else
			System.out.println(n+" number is not divisible by 5");
	}

	
}
