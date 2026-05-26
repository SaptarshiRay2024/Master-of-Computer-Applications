import java.io.*;
import java.util.*;

class Assignment_1_10a
{
	void letters()
	{
		char i;
		for(i='A' ; i<='Z' ; i++)
		{
			System.out.print(i + " ");
		}
	}
}

class Assignment_1_10
{
	public static void main(String[] args)
	{
		Assignment_1_10a obj1 = new Assignment_1_10a();
		obj1.letters();
	}
}