import java.util.Scanner;
class Reverse_Number
{
 public static void main(String args[])
 {
   int x, y, sum = 0;
 Scanner s = new Scanner(System.in);
 System.out.print("Enter Number: ");
 x = s.nextInt();
 while(x > 0)
 {
 y = x % 10;
 sum = sum * 10 + y;
 x = x / 10;
 }
 System.out.println("Reverse of a Number is "+sum);
 }
}