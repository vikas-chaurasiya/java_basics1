package com.pa.ma;

import java.util.Scanner;

public class ATM_Transaction {
	public static void main(String[] args) {
		int balance=300000, withdraw, deposite;
		Scanner s=new Scanner(System.in);
		while(true) 
		{
			System.out.println("               							     ATM              ");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.print("		  1- Withdraw    		   ");
			System.out.print("2- Deposite      		 ");
			System.out.print("3- Check Balance     	 	 ");
			System.out.println("4- Exit      	 	");
			System.out.println();
			System.out.println();
			System.out.print("			choose the opertion you want to perform:::");
			int n=s.nextInt();
			switch(n) 
			{
			case 1:
				System.out.println();
				System.out.print("			Enter money to withdraw:::");
				withdraw=s.nextInt();
				if(balance >= withdraw) 
				{
					balance= balance-withdraw;
					System.out.println();
					System.out.println("			Please collect your money");
				}
				else 
				{
					System.out.println();
					System.out.println("			Insufficient balance");
				}
				
				break;
				
			case 2:
				System.out.println();
				System.out.print("			Enter money to deposite:::");
				deposite=s.nextInt();
				balance=balance+deposite;
				System.out.println();
				System.out.println("			your money is successfully deposite");
				break;
				
			case 3:
				System.out.println();
				System.out.println("			your balance:::"+balance);
				break;
				
			case 4:
				System.out.println();
				System.exit(0);
			}
		}
	}

	
}
