package com.pa.ma;

//using class name
public class StaticMember1 
{
	public static void main(String[] args) 
	{
		System.out.println(".main..");
		StaticMember1.fun();// method call --> single statement
		System.out.println("main method ends");
	}
	static void fun()
	{
		System.out.println("User method");
	}

}
