import java.io.*;
import java.util.*;
class Product
{
static int product(int x, int y)
{
if (x < y)
return product(y, x);
else if (y != 0)
return (x + product(x, y - 1));
else
return 0;
}
// Driver Code
public static void main (String[] args)
{
int x = 25, y = 12;
System.out.println(product(x, y));
}
}