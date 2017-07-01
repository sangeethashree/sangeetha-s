import java.util.*;
import java.io.*;
public class rev{
public static void main(String[] args){
int a,ans=0,rem;
Scanner s=new Scanner(System.in);
a=s.nextInt();
while(a!=0)
{
rem=a%10;
ans=ans*10+rem;
a=a/10;
}
System.out.println("the reverse value is"+ans);

}
}
