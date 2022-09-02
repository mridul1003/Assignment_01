import java.util.Scanner;
class volumecylinder
{
public static void main(String[] args)
{
double r,h,v;
Scanner ob=new Scanner(System.in);
System.out.println("enter radius of cylinder");
r=ob.nextDouble();
System.out.println("enter height of cylinder");
h=ob.nextDouble();
v=3.14*r*r*h;
System.out.println("volume of cylinder="+v); 
}
}