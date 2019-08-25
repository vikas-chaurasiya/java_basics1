package com.pa.ma;

public class Example3 {

	static 
	{
		int a=20;
		System.out.println(Example3.a);
		Example3.a=Example3.a + a;
		System.out.println(Example3.a);
		a = a+Example3.a;
		System.out.println(a);
		Example3.a = a+a;
		System.out.println(Example3.a);
	}
	static int a=10;
	public static void main(String[] args) 
	{
		System.out.println("global a :"+Example3.a);
	}

}
