package com.pa.ma;

public class Test
{
	//overloading
	public void m1(String s) 
	{
		System.out.println("string-arg");
	}
	public void m1(Object o) 
	{
		System.out.println("object-arg");
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.m1(1);
		t.m1(10.5);
		t.m1('v');
		t.m1("chcc");
		t.m1(10l);
		t.m1(null);
		
	}
}
