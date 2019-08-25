package com.pa.ma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber {

	public static void main(String[] args) throws IOException {
		/*int m, n ,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number ");
		m=s.nextInt();
		while(m>0) 
		{
			n=m%10;
			m=m/10;	
			sum=sum*10+n;
			
		}
		System.out.println(sum);*/
		/*String s1="aabbcab";
		String s2="abcabba";
		if(s1.length()!=s2.length()){
			System.out.println("Strings are not same, lengths are different!!!");
			return;
		}
		
		boolean flg=true;
		for(int loop=0; loop<s1.length();loop++){
			if(s1.charAt(loop)!=s2.charAt(loop)){
				flg=false;
				break;
			}
		}
		
		if(flg){
			System.out.println("Strings are same.");
		}
		else{
			System.out.println("Strings are not same.");
		}*/
		
		/*		int m,n=0;
				Scanner s=new Scanner(System.in);
				System.out.println("enter m number::");
				m=s.nextInt();
				System.out.println("enter n number::");
				n=s.nextInt();
				m=m^n;
				n=m^n;
				m=m^n;
				System.out.println("swap the number::"+m +" "+n);
				*/
		/*int a,b,c,d=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter three numbers::");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		System.out.println("highest number is::"+d);*/
		
		/*char m;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the upper char or lower char or digit::");
		m=(char) br.read();
		if(m>=97 && m<=123)
			System.out.println("lower case");
		else if(m>=65 && m<=96)
			System.out.println("upper case");
		else if(m>48 && m<=57)
			System.out.println("digit");
		else
			System.out.println("spcl symbol");*/
	}

}
