package com.pa.ma;

public class RunTime {

	public static void main(String[] args) {
		doStuff();
	}
	public static void doStuff() 
	{
		doMoreStuff();
	}
	public static void doMoreStuff() 
	{
		//System.out.println("hello runtime ");
		//System.out.println(10/0); ArithmeticException / by zero
	}

}
