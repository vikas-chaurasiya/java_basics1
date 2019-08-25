package com.pa.ma;

public class StaticUserMethod5 
{
	public static void main(String[] args) {
		String s="This is a book";
		String[] sa=s.split(" ");
		String rev="";
		
		
		for(int i=sa.length-1; i>=0; i--) 
		{
			rev=rev+sa[i]+" ";
		}
		System.out.println(rev);
	}
}
