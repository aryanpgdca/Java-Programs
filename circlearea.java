//Area = pi * r2

//where r is radius of circle

class circlearea
{
static final double PI = Math.PI;
static double findArea(int r)
{
return PI * Math.pow(r, 2);
}
public static void main(String[] args)
{
System.out.println("Area is " + findArea(5));
}
}