import java.util.*;
import java.io.*;
public class fibo{
public static void main(String []args){
int i,n,f1=0;,f2=1,f3;
Scanner s=new Scanner(System.in);
System.out.println("enter the value");
n=s.nextInt();
for(i=0;i<n;i++)
{
System.out.println("the result is"+f1);
f3=f1+f2;
f1=f2;
f2=f3;
}
}
}
