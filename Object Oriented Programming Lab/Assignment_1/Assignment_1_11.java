import java.io.*;
import java.util.*;

class Assignment_1_11a
{
	int calculate_power(int n, int e)
	{
		int p, i;
		p=1;
		i=1;
		while(i<=e)
		{
			p=p*n;
			i++;	
		}
		return p;
	}
}

class Assignment_1_11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, e, p;
		System.out.print("Enter number : ");
		n=sc.nextInt();
		System.out.print("Enter exponent : ");
		e=sc.nextInt();
		Assignment_1_11a obj1 = new Assignment_1_11a();
		p=obj1.calculate_power(n,e);
		System.out.println("Power of the given number : " + p);
	}
}