import java.io.*;
import java.util.Scanner;
class Program1
{
    public static void main(String a[])
    {
        int x, y, z;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        x=sc.nextInt();
        System.out.print("Enter second number : ");
        y=sc.nextInt();
        z=x+y;
        System.out.print("Sum : " + z);
        sc.close();
    }
}