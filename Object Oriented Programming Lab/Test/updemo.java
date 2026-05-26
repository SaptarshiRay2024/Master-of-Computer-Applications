import java.io.*;
import java.util.*;

class second
{
    int update(int n)
    {
        n++;
        return n;
    }
}

class updemo
{
    public static void main(String[] args)
    {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        x=sc.nextInt();
        second obj = new second();
        y=obj.update(x);
        System.out.println("Updated value : " + y);
    }
}