import java.io.*;
import java.util.*;
 public class Fa {
public static void main(String[] args) {
double celsius,fahrenheat;
Scanner sc=new Scanner(System.in);
System.out.print("enter temperature(celsius) = ");      
celsius =sc.nextDouble();
 fahrenheat = (celsius*9.0/5.0+32);
 System.out.println("Temperature is(fahrenheat) = "+fahrenheat);

}
}
