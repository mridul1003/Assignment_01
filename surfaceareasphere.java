import java.util.Scanner;
class surfaceareasphere
{
public static void main(String[] args)
{
double r,s;
Scanner ob=new Scanner(System.in);
System.out.println("enter radius of sphere");
r=ob.nextDouble();
s=4*3.14*r*r;
System.out.println("surface area of sphere="+s); 
}
}