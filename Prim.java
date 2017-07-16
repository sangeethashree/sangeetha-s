import java.util.*;
import java.io.*;
 class Prim{
public static void main(String[] args){
int j,s,a=0;
int num;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
for(j=2;j<=Math.sqrt(num);j++)
{
if(num%j==0)
{
System.out.println("it is not a prime number");
}
else
{
System.out.println("it is a prime number");
}
}
}
 }
