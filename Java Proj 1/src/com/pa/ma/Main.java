package com.pa.ma;

class Parent
{
	void marry()
	{
		System.out.println("shubha");
	}
}
class Child extends Parent
{
	void marry()
	{
		System.out.println("vikas");
	}
	
}
public class Main {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.marry();
		
		Child c= new Child();
		c.marry();
		
		Parent p1= new Child();
		p1.marry();

	}

}
