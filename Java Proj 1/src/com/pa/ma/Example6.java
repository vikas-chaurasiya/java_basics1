package com.pa.ma;

public class Example6 {

	static int a= Example6.fun();
	public static void main(String[] args)
	{
		System.out.println(Example6.a);
	}
	static int fun() 
	{
		Example6.a = 57;
		return Example6.fun1();
	}
	static int fun1()
	{
		System.out.println(Example6.a);
		return 100;
	}

}
