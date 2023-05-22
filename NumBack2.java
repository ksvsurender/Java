/* Write a program to print numbers backwards from 100 to 1 by skipping 3 numbers i.e. 100 97 94 91 88 85 82 79. . . 22 19 16 13 10 7 4 1 */


import java.util.*;
class NumBack2
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter the limit of loop ");
        int n=s.nextInt();
        for (int i=n;i>=0;i-=3)
        {
            System.out.println(i);
        }
    }
}





// Using CommandLine

class NumBack2
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        for (int i=n;i>=0;i-=3)
        {
            System.out.println(i);
        }
    }
}



