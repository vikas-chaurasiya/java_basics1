package com.pa.ma;

public class StaticMember3 
{
	static void fun1()
	{
		System.out.println("User method fun1..");
	}
	public static void main(String[] args) 
	{
		System.out.println(".main..");
		System.out.println("calling fun2 method");
		StaticMember3.fun2();
		System.out.println("control back to main from fun2 method");
		System.out.println("main method ends");
	}
	static 
	{
		System.out.println("block starts");
		System.out.println("calling fun1 method");
		StaticMember3.fun1();
		System.out.println("control back to static block from fun1 ");
		System.out.println("StaticBlock ends");
	}
	static void fun2()
	{
		System.out.println("control in fun2");
		System.out.println("calling fun1 method");
		StaticMember3.fun1();
		System.out.println("Control back to fun2 from fun1");
		System.out.println("User method 2..");
	}

}
