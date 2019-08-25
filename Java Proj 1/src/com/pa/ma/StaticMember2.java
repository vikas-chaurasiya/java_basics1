package com.pa.ma;

public class StaticMember2 
{
	public static void main(String[] args) 
	{
		System.out.println(".main..");
		StaticMember2.fun();
		System.out.println("main method ends");
	}
	static void fun()
	{
		System.out.println("User method");
	}
	static 
	{
		System.out.println("block starts");
		StaticMember2.fun();
		System.out.println("StaticBlock1...");
	}

}
