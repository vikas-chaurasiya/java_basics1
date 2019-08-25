package com.pa.ma;

public class Example8 
{
	static int a=Example8.fun();
	public static void main(String[] args) {
		System.out.println(Example8.a);
	}
	static 
	{
		System.out.println(Example8.a);
		Example8.a = Example8.a+20;
	}
	static int fun() 
	{
		Example8.a = 50;
		return Example8.fun1();
	}
	static int fun1() 
	{
		System.out.println(Example8.a);
		return 100;
	}

}
