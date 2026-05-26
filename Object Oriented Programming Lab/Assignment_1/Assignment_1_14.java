import java.io.*;
import java.util.*;

class Assignment_1_14a
{
	boolean palindrome(int n)
	{
		int original_n, reversed_n, last_digit;
		original_n=n;
		reversed_n=0;
		while(n!=0)
		{
			last_digit=n%10;
			reversed_n=reversed_n*10+last_digit;
			n=n/10;
		}
		return original_n==reversed_n;
	}
}

class Assignment_1_14
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter number : ");
		n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Enter a positive number");
		}
		else
		{
			Assignment_1_14a obj1 = new Assignment_1_14a();
			if(obj1.palindrome(n))
			{
				System.out.println("Given number is a palindrome");
			}
			else
			{
				System.out.println("Given number is not a palindrome");
			}
		}
	}
}