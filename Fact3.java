# Fact3
import java.io.*;
import java.util.*;
public class Fact
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n;
    int fact=1;
    System.out.println("Enter a number");
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
      fact=fact*i;
    }
    System.out.println("Factorial of "+n+" is:"+fact);
  }
}
