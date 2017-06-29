import java.util.*;
import java .io.*;
public class Leap{
public static void main(String [] args){
int lp;
Scanner sc=new Scanner(System.in);
lp=sc.nextInt();
if((lp%4)&&(lp%100)==0)
{
System.out.println("leap year");
}
else
{
System.out.println("not a leap year");
}
}
}
