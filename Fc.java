import java.util.*;
import java .io.*;
 class Fc{
public static void main(String[] args){
int a,i,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value");
a=sc.nextInt();
for(i=1;i<=a;i++)
{
fact=i*fact;
}
System.out.println("the factorial is"+fact);

}}
  
