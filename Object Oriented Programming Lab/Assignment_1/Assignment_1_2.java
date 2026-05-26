import java.io.*;

class Assignment_1_2a
{
	void primes(int n)
	{
		int i, j, f;
		i=2;
		while(i<=n)
		{
			f=0;
			for(j=2; j<i; j++)
			{
				if(i%j==0)
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				System.out.print(i + " ");
			}
			i++;
		}
	}
}

class Assignment_1_2
{
	public static void main(String[] args)
	{
		int n;
		n=1000;
		Assignment_1_2a obj1 = new Assignment_1_2a();
		obj1.primes(n);
	}
}