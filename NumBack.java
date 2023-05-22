/* Write a program to print all numbers backwards from 100 to 0 i.e. 100 99 98 97 96 . . . 4 3 2 1 0 */


import java.util.*;
class NumBack
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter the limit of loop ");
        int n=s.nextInt();
        for (int i=n;i>=0;i--)
        {
            System.out.println(i);
        }
    }
}





// Using CommandLine

class NumBack
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        for (int i=n;i>=0;i--)
        {
            System.out.println(i);
        }
    }
}

