#Incomplete
import java.io.*;
import java.util.*;

class Assignment_1_9a
{
	int sequence(int n)
	{
		int i, f, s;
		f=1;
		s=0;
		i=1;
		while(i<=n)
		{
			f=f*i;
			s=s+(1/f);
			i++;
		}
		return s;
	}
}

class Assignment_1_9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, s;
		System.out.print("Enter range : ");
		n=sc.nextInt();
		Assignment_1_9a obj1 = new Assignment_1_9a();
		s=obj1.sequence(n);
		System.out.println("Sum : " + s);
	}
}