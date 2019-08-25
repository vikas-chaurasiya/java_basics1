package com.pa.ma;

public class Example1 {

	static int a=10;
	public static void main(String[] args) 
	{
		int a=20;
		System.out.println(Example1.a);
		Example1.a=Example1.a + a;
		System.out.println(Example1.a);
		a =a+Example1.a;
		System.out.println(a);
		Example1.a = Example1.a + a + Example1.a;
		System.out.println(Example1.a);
		System.out.println(a);
	}

}
