/* Write a program that accepts a number N and print weather it is positive negative or zero */


class Number
{
public static void main (String args[])
{
int a=Integer.parseInt(args[0]);
if (a>0){System.out.println("Positive");}
else if (a==0){System.out.println("Zero");}
else{System.out.println("Negative");}
}}
