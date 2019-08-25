package com.pa.ma;

public class Example4 {

	static 
	{
		int a=20;
		System.out.println(Example4.a);
		Example4.a=Example4.a + a;
		System.out.println(Example4.a);
		a = a+Example4.a;
		System.out.println(a);
		Example4.a = a+a;
		System.out.println(Example4.a);
	}
	static int a;
	public static void main(String[] args) 
	{
		System.out.println("global a :"+Example4.a);
	}

}
