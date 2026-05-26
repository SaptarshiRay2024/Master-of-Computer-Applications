import java.io.*;
import java.util.*;

class Assignment_1_13a
{
	boolean sum_of_primes(int n)
	{
		int i;
		for(i=2 ; i<=n/2 ; i++)
		{
			if(check_prime(i) && check_prime(n-i))
			{
				
			}
		}
	}
	boolean check_prime(int n)
	{
		if(n<=1)
		{
			return false
		}
		for(int i=2 ; i<=Math.sqrt(n) ; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}

class Assignment_1_13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter number : ");
		n=sc.nextInt();
		Assignment_1_13a obj1 = new Assignment_1_13a();
		obj1.sum_of_primes(n);
	}
}