import java.io.*;
import java.util.*;

class Assignment_1_7a
{
	void sequence(int n)
	{
		int s1, s2, i;
		s1=0;
		s2=1;
		i=1;
		while(i<=n)
		{
			s1=s1+2;
			System.out.print(s1);
			System.out.print(",");
			s2=s2*i;
			System.out.print(s2);
			System.out.print(",");
			i++;
		}
	}
}

class Assignment_1_7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter range : ");
		n=sc.nextInt();
		Assignment_1_7a obj1 = new Assignment_1_7a();
		obj1.sequence(n);
	}
}