import java.io.*;
import java.util.*;

class Assignment_1_8a
{
	int calculate_gcd(int n1, int n2)
	{
		int gcd, r, x;
		if(n1>n2)
		{
			x=n1;
			n1=n2;
			n2=x;
		}
		while(n1!=0)
		{
			x=n1;
			n1=n2%n1;
			n2=x;	
		}
		return n2;
	}
}

class Assignment_1_8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int gcd, n1, n2;
		System.out.print("Enter first number : ");
		n1=sc.nextInt();
		System.out.print("Enter second number : ");
		n2=sc.nextInt();
		Assignment_1_8a obj1 = new Assignment_1_8a();
		gcd=obj1.calculate_gcd(n1,n2);
		System.out.println("GCD of the given numbers : " + gcd);
	}
}