package com.pa.ma;

public class StaticBlock3 
{
	static 
	{
		//1
		System.out.println("StaticBlock1...");
	}
	public static void main(String[] args) 
	{
		//3
		System.out.println(".main..");
	}
	static 
	{
		//2
		System.out.println("StaticBlock2..");
	}

}
