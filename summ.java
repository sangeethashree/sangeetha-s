import java.io.*;
import java.util.*;
class summ{
public static void main(String args[])
{
int a,total=0;
Scanner sc=new Scanner(System.in);
System.out.println(" enter the value upto you want");
a=sc.nextInt();
for(int i=0;i<=a;i++)
{
total=total+i;
}
System.out.println("The sum of the natural numbers are"+total);
}
}
