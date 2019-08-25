package com.pa.ma;

public class StaticUserMethod3 
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println(StaticUserMethod3.a);
		StaticUserMethod3.initialize();
		System.out.println(StaticUserMethod3.a);
	}
	static int initialize()
	{
		return 100;
	}

}
