// Write a program to print the sizes of char, int, short, long, byte, float, double.

import java.io.*;

class Program2
{
    public static void main(String a[])
    {
        System.out.println("byte size : " + Byte.BYTES);
        System.out.println("short size : " + Short.BYTES);
        System.out.println("int size : " + Integer.BYTES);
        System.out.println("long size : " + Long.BYTES);
        System.out.println("float size : " + Float.BYTES);
        System.out.println("double size : " + Double.BYTES);
        System.out.println("char size : " + Character.BYTES);
        System.out.println();
        System.out.println("byte min value : " + Byte.MIN_VALUE);
        System.out.println("byte max vallue : " + Byte.MAX_VALUE);
        System.out.println("short min value : " + Short.MIN_VALUE);
        System.out.println("short max vallue : " + Short.MAX_VALUE);
        System.out.println("int min value : " + Integer.MIN_VALUE);
        System.out.println("int max vallue : " + Integer.MAX_VALUE);
        System.out.println("long min value : " + Long.MIN_VALUE);
        System.out.println("long max vallue : " + Long.MAX_VALUE);
        System.out.println("float min value : " + Float.MIN_VALUE);
        System.out.println("float max vallue : " + Float.MAX_VALUE);
        System.out.println("double min value : " + Double.MIN_VALUE);
        System.out.println("double max vallue : " + Double.MAX_VALUE);
        System.out.println("char min value : " + (int)Character.MIN_VALUE);
        System.out.println("char max vallue : " + (int)Character.MAX_VALUE);
    }
}