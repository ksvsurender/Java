/* Write a program to print alternate numbers starting from 0 to 100 i.e. 0 2 4 6 8 10 12 . . . 96 98 100 */

import java.util.*;
class AltLoop2
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter the limit of loop ");
        int n=s.nextInt();
        for (int i=0;i<=n;i=i+2)
        {
            System.out.println(i);
        }
    }
}





// Using CommandLine

class AltLoop2
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        for (int i=0;i<=n;i+=2)
        {
            System.out.println(i);
        }
    }
}





// Alternate code
import java.util.*;
class AltLoop2
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter the limit of loop ");
        int n=s.nextInt();
        for (int i=0;i<=n+1;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}