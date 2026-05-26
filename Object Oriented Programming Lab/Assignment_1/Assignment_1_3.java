import java.io.*;

class Assignment_1_3a
{
	void fibo_primes(int n)
	{
		int a, b, c, i, f;
		a=0;
		b=1;
		c=a+b;
		while(true)
		{
			f=0;
			if(c==1)
			{
				f=1;
			}
			else
			{
				for(i=2; i<c; i++)
				{
					if(c%i==0)
					{
						f=1;
						break;
					}
				}
			}
			if(f==0)
			{
				System.out.print(c + " ");
				n--;
				if(n==0)
				{
					break;
				}
			}
			a=b;
			b=c;
			c=a+b;
		}
	}
}

class Assignment_1_3
{
	public static void main(String[] args)
	{
		int n;
		n=8;
		Assignment_1_3a obj1 = new Assignment_1_3a();
		obj1.fibo_primes(n);
	}
}