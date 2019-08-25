package com.pa.ma;

public class LocalVariable2 
{
	static 
	{
		int a=10;//local
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		//System.out.println(a); Error:: undefined symbol
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//a cannot be resolved to a variable
	}

}
