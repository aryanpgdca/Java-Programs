import java.util.Scanner;
class CheckPrime
{
 public static void main(String args[])
 { 
 int i, num, flag = 1;
 System.out.print("Enter the number :");
 Scanner s = new Scanner(System.in);
 num = s.nextInt();
 for(i = 2; i < num; i++)
 {
   if(num % i == 0)
 {
 flag = 0;
 break;
 }
 }
 if(flag == 1)
 System.out.println(""+num+" is a prime number.");
 else
 System.out.println(""+num+" is not a prime number.");
 }
}