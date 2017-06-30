import java.util.*;
import java.io.*;
public class cal{
  public static void main(String[] args){
int i,g,a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the table value");
a=sc.nextInt();
for(i=1;i<=10;i++)
{
g=i*a;
System.out.println(a+"*"+i+"="+g);
}
}
}
