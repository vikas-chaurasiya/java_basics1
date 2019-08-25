package com.pa.ma;

public class StaticVariable1 
{
	static int a=100;
	static 
	{
		System.out.println("static block");
		System.out.println(StaticVariable1.a);
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
		System.out.println(StaticVariable1.a);
	}
	
}
