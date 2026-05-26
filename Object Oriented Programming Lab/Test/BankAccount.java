//Write a program in Java to create a class BankAccount with account_number, name and balance. Perform deposit() and withdraw() operations.

import java.io.*;
import java.util.*;

class BankAccount_1
{
	float deposit(float balance)
	{
		Scanner sc = new Scanner(System.in);
		float amount;
		System.out.println("Current balance : " + balance);
		System.out.print("Enter amount to deposit : ");
		amount=sc.nextFloat();
		balance=balance+amount;
		return balance;
	}
	float withdraw(float balance)
	{
		Scanner sc = new Scanner(System.in);
		float amount;
		System.out.println("Current balance : " + balance);
		System.out.print("Enter amount to withdraw : ");
		amount=sc.nextFloat();
		if(balance==0)
		{
			System.out.println("Withdrawal failed");
			System.out.println("Balance is 0");
		}
		else
		{
			balance=balance-amount;
		}
		return balance;
	}
}

class BankAccount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int account_number, choice;
		String name;
		float balance;
		account_number=1234;
		name="ABCD";
		balance=0;
		System.out.println("Welcome " + name);
		System.out.println("Account Number : " + account_number);
		BankAccount_1 obj1 = new BankAccount_1();
		while(true)
		{
			System.out.println();
			System.out.println("Enter 1 to display balance");
			System.out.println("Enter 2 to deposit amount");
			System.out.println("Enter 3 to withdraw amount");
			System.out.println("Enter 0 to exit");
			System.out.println();
			System.out.print("Enter your choice : ");
			choice=sc.nextInt();
			System.out.println();
			if(choice==0)
			{
				System.out.println("Logged out");
				break;
			}
			else if(choice==1)
			{
				System.out.println("Current balance : " + balance);
			}
			else if(choice==2)
			{
				balance=obj1.deposit(balance);
				System.out.println("New balance : " + balance);
			}
			else if(choice==3)
			{
				
				balance=obj1.withdraw(balance);
				System.out.println("New balance : " + balance);
			}
			else
			{
				System.out.println("Invalid choice");
			}
		}
	}
}