import java.io.*;
import java.util.*;

class Assignment_1_5a
{
	void sequence(int n)
	{
		int a, b, c, d, i;
		a=0;
		b=1;
		c=a+b;
		d=-1;
		i=1;
		while(i<=n)
		{
			if(i==1)
			{
				System.out.print(a);
			}
			else if(i==2)
			{
				System.out.print(b);
			}
			else
			{
				System.out.print(c);
				a=b;
				b=c;
				c=a+b;
			}
			System.out.print(",");
			System.out.print(d);
			d=d-3;
			System.out.print(",");
			i++;
		}
	}
}

class Assignment_1_5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter range : ");
		n=sc.nextInt();
		Assignment_1_5a obj1 = new Assignment_1_5a();
		obj1.sequence(n);
	}
}