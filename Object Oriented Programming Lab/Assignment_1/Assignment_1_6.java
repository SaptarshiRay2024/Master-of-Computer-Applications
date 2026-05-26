import java.io.*;
import java.util.*;

class Assignment_1_6a
{
	int factorial(int n)
	{
		int f;
		f=1;
		while(n>0)
		{
			f=f*n;
			n--;
		}
	return f;
	}
}

class Assignment_1_6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, f;
		System.out.print("Enter number : ");
		n=sc.nextInt();
		Assignment_1_6a obj1 = new Assignment_1_6a();
		f=obj1.factorial(n);
		System.out.println("Factorial of given number : " + f);
	}
}