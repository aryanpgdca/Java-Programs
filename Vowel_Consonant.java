import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class Vowel_Consonant
{
 public static void main(String[] args) throws Exception
 {
 char ch;
 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 System.out.print("Enter the character you want to check:");
 ch = (char) bf.read();
 switch(ch)
 {
 case 'a':
 System.out.println("Character "+ch+" is vowel");
 break;
 case 'e':
 System.out.println("Character "+ch+" is vowel");
 break;
 case 'i':
 System.out.println("Character "+ch+" is vowel");
 break;
 case 'o':
 System.out.println("Character "+ch+" is vowel");
 break;
 case 'u':
 System.out.println("Character "+ch+" is vowel");
 break;
 default:
 System.out.println("Character "+ch+" is consonant");
 break;
 }
 }
}