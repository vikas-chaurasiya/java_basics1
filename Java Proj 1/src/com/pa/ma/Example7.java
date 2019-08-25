package com.pa.ma;

public class Example7 
{
	static int a=50;
	public static void main(String[] args) {
		System.out.println(Example7.fun()+Example7.a);
	}
	static int fun() 
	{
		Example7.a=Example7.a + 100;
		System.out.println(Example7.a);
		return Example7.a;
	}

}
