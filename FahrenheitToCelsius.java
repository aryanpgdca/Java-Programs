import java.util.*;
class FahrenheitToCelsius
{
 public static void main(String[] args)
 {
float temperatue;
 Scanner in = new Scanner(System.in);
 System.out.println("Enter Fahrenheit: ");
 temperatue = in.nextInt();
 temperatue = ((temperatue - 32)*5)/9;
 System.out.println("Temperatue in Celsius = "
 + temperatue);
 }
 }