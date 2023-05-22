/* Write a program to accept a number N and print whether the number is EVEN or ODD */ 
class EvenOdd
{
    public static void main (String args[])
    {
        int a=Integer.parseInt(args[0]);
        if (a%2==0)
        {
            System.out.println(args[0]+" is Even ");
        }
        else 
        {
            System.out.println(args[0]+" is Odd ");
        }
    }
}


/* Using Scanner class */
import java.util.*;
class EvenOdd
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter a number ");
        int a=s.nextInt();
        if (a%2==0)
        {
            System.out.println(a+" is Even ");
        }
        else 
        {
            System.out.println(a+" is Odd ");
        }
    }
}