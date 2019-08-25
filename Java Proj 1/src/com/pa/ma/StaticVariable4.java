package com.pa.ma;

public class StaticVariable4 
{
	static int a=100;
	public static void main(String[] args) 
	{
		int a=200;
		System.out.println(StaticVariable4.a);
		System.out.println(a);//local priority
	}
	
}
