import java.util.*;
import java.io.*;
public class Prim{
public static void main(String[] args){
int i,s,a=0;
int n;
Scanner sc=new Scanner(System.in);
n=sc.newInt();
int s=n/2;
for(i=2;i<=s;i++)
{
if(n%i==0)
{
System.out.println("it is a prime number");
}
else
{
System.out.println("it is not a prime number");
}
}
}
