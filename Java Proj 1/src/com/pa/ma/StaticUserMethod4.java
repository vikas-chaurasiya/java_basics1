package com.pa.ma;

public class StaticUserMethod4 
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println(StaticUserMethod4.a);
		StaticUserMethod4.initialize(56);
		System.out.println(StaticUserMethod4.a);
	}
	static void initialize(int x)
	{
		StaticUserMethod4.a = x;
	}

}
