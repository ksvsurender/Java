/* Write a program to accept two numbers and print whether their sum is EVEN or ODD */

class EvenOdd2
{
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=a+b;
        if (c>0)
        {
             if (c%2==0)
        {
            System.out.println(c+" is even ");
        }
        else 
        {
            System.out.println(c+" is odd ");
        }
        }
        else 
        {
            if (c%2==0)
        {
            System.out.println("-"+Math.abs(c)+" is even ");
        }
        else 
        {
            System.out.println("-"+Math.abs(c)+" is odd ");
        }
        }
       
    }
}

// Using Scanner class 

import java.util.*;
class EvenOdd2
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter first number ");
        int a=s.nextInt();
        System.out.println(" Enter second number ");
        int b=s.nextInt();
        int c=a+b;
       if (c>0)
        {
             if (c%2==0)
        {
            System.out.println(c+" is even ");
        }
        else 
        {
            System.out.println(c+" is odd ");
        }
        }
        else 
        {
            if (c%2==0)
        {
            System.out.println("-"+Math.abs(c)+" is even ");
        }
        else 
        {
            System.out.println("-"+Math.abs(c)+" is odd ");
        }
        }
        
    }
}