import java.io.*;
import java.util.*;

class Assignment_1_15a
{
	void random(int low, int high)
	{
		Random rd = new Random();
		int n, i;
		System.out.println("5 random numbers between 1 and 100");
		for(i=1 ; i<=5 ; i++)
		{
			n=rd.nextInt(100)+1;
			System.out.print(n + " ");
		}
	}
}

class Assignment_1_15
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int low, high;
		low=1;
		high=100;
		Assignment_1_15a obj1 = new Assignment_1_15a();
		obj1.random(low, high);
	}
}