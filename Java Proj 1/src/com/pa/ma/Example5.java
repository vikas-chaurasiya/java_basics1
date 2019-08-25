package com.pa.ma;

public class Example5 {

	static 
	{
		int a=20;
		System.out.println(Example5.a);
		Example5.a = a+a;
		System.out.println(Example5.a);
	}
	static int a;
	public static void main(String[] args) 
	{
		System.out.println("global a :"+Example5.a);
	}
	static 
	{
		a=a+Example5.a;
		System.out.println(a);
	}

}
