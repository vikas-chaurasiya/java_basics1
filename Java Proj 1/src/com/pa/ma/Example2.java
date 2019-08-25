package com.pa.ma;

public class Example2 {

	static 
	{
		int a=20;
		System.out.println(Example2.a);
		Example2.a=Example2.a + a;
		System.out.println(Example2.a);
	}
	static int a=10;
	public static void main(String[] args) 
	{
		System.out.println("global a :"+Example2.a);
	}

}
