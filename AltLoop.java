/* Write a program to print alternate numbers starting from 1 to 99 i.e. 1 3 5 7 9 11 13 . . . 95 97 99 */

import java.util.*;
class AltLoop
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter the limit of loop ");
        int n=s.nextInt();
        for (int i=1;i<=n;i=i+2)
        {
            System.out.println(i);
        }
    }
}





// Using CommandLine

class AltLoop
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        for (int i=1;i<=n;i+=2)
        {
            System.out.println(i);
        }
    }
}





// Alternate code
import java.util.*;
class AltLoop
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter the limit of loop ");
        int n=s.nextInt();
        for (int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
