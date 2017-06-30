import java.util.*;
import java.io.*;
public class Pall{
public static void main(String[] args){
int a,t,n;
int val=0;
t=n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
while(n>0)
{
a=n%10;
n=n/10;
}
if(t==val)
{
System.out.println("the given number is a palindrome");
}
else
{
System.out.println("the given number is not a palindrome");
}
}
}
