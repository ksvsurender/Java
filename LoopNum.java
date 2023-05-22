/* Write a program to print all numbers from 1 to 100 i.e. 1 2 3 4 5 6 7 . . . 98 99 100 */
import java.util.*;
class LoopNum
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter the limit of loop ");
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}

// Using CommandLine

class LoopNum
{
    public static void main (String args[])
    {
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}