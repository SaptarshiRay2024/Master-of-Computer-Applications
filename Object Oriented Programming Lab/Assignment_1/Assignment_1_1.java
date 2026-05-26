import java.io.*;

class Assignment_1_1a
{
	int fibo_series(int n)
	{
		int a, b, c, s, i;
		a=0;
		b=1;
		c=a+b;
		s=a+b;
		i=1;
		while(i<=n)
		{
			if(i==1)
			{
				System.out.println(a);
			}
			else if(i==2)
			{
				System.out.println(b);
			}
			else
			{
				System.out.println(c);
				s=s+c;
				a=b;
				b=c;
				c=a+b;
			}
			i++;
		}
		return s;
	}
}

class Assignment_1_1
{
	public static void main(String[] args)
	{
		int n, s;
		n=10;
		Assignment_1_1a obj1 = new Assignment_1_1a();
		s=obj1.fibo_series(n);
		System.out.println("Sum of Fibonacci Series : " + s);
	}
}