import java.io.*;
import java.util.*;

class Assignment_1_16a
{
	int sum_of_integers(int low, int high)
	{
		int i, sum;
		sum=0;
		for(i=low+1 ; i<high ; i++)
		{
			if(i%7==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}

class Assignment_1_16
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum, low, high;
		low=100;
		high=200;
		Assignment_1_16a obj1 = new Assignment_1_16a();
		sum=obj1.sum_of_integers(low, high);
		System.out.println("Sum : " + sum);
	}
}