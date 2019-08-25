package com.pa.ma;

import java.util.ArrayList;
import java.util.List;

public class A {
	int x=10;//instance variable
	static int c=20;//staric variable
	public static void main(String[] args) {
		int x=60;//local variable
		A a=new A();
		System.out.println(a.x);
		System.out.println(c);
		System.out.println(A.c);
		System.out.println(a.c);
		System.out.println(x);
	}
	
	/*
	 * public void m1() { System.out.println(x); }
	 */
	
		/*
		 * int[][] a=new int[6][3]; System.out.println(a); System.out.println(a.length);
		 * System.out.println(a[0].length);
		 */
		
		/*sum(new int[] {10,20,30,40});
		 
	}
	
	public static void sum(int[] x) {
		int total=0;
		for(int x1:x) 
		{
			total=total+x1;
		}
		System.out.println(total);
	}*/	
		
	
}
