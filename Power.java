import java.util.Scanner;
public class Power
{
 public static void main(String args[])
 {
 int x;
 double y;
 System.out.print("Enter any number: ");
 Scanner s = new Scanner(System.in);
 x = s.nextInt();
 y = Math.pow(x , 2);
 System.out.println("Square of "+x+" is :"+y);
 }
}