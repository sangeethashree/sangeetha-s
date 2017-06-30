import java.util.*;
import java.io.*;
public class pog{
public  static void main(String[] args){
char cs;
Scanner sc=new Scanner(System.in);
System.out.println("enter the character");
cs=sc.next().charAt(0);
if(cs== 'a' ||cs== 'e' ||cs== 'i' ||cs== 'o' ||cs== 'u' ||cs== 'A' ||cs== 'E' ||cs== 'I' ||cs== 'O' ||cs== 'u' ){
System.out.println("the character is vowel");
}
else
{
System.out.println("the character is consonant");
}
}
}
