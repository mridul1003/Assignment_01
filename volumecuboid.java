import java.util.Scanner;
class volumecuboid
{
public static void main(String[] args)
{
double l,b,h,v;
Scanner ob=new Scanner(System.in);
System.out.println("enter length of cuboid");
l=ob.nextDouble();
System.out.println("enter breadth of cuboid");
b=ob.nextDouble();
System.out.println("enter height of cuboid");
h=ob.nextDouble();
v=l*b*h;
System.out.println("volume of cuboid="+v); 
}
}