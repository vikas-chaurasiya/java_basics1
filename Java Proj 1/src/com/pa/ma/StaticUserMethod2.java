package com.pa.ma;

public class StaticUserMethod2 {

	
	static int a;
	public static void main(String[] args) 
	{
		System.out.println(StaticUserMethod2.a);
		StaticUserMethod2.initialize();
		System.out.println(StaticUserMethod2.a);
	}
	static void initialize()
	{
		StaticUserMethod2.a = 100;
		System.out.println("st"+a);
	}

}
