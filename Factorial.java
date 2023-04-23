import java.util.Scanner;
class Factorial
{
 public static void main(String[] args)
 {
 long n, fact = 1;
 Scanner s = new Scanner(System.in);
 System.out.print("Enter Any Number: ");
 n = s.nextInt();
 for(int i = 1; i <= n; i++)
 {
 fact = fact * i;
 }
 System.out.println("Factorial of "+n+" is "+fact);
 }
}