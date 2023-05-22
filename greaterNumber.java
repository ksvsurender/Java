/*Write a program to accept two numbers and print the greater value of the two */
class greaterNumber{
    public static void main (String args[])
    {
        int a =Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        if (a>b)
        {
            System.out.println(" The greater number among "+args[0]+" and "+args[1]+" is "+a);
        }
        else
        {
            System.out.println(" The greater number among "+args[0]+" and "+args[1]+" is "+b);
        }
        
    }
}