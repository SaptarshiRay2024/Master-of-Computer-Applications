import java.io.*;
import java.util.*;

class Assignment_1_12a
{
	void factors(int n)
	{
		int i;
		System.out.println("Factors of " + n);
		for(i=1 ; i<=n ; i++)
		{
			if(n%i==0)
			{
				System.out.print(i + " ");
			}
		}
	}
}

class Assignment_1_12
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter number : ");
		n=sc.nextInt();
		Assignment_1_12a obj1 = new Assignment_1_12a();
		obj1.factors(n);
	}
}