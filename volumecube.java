import java.util.Scanner;
class volumecube
{
public static void main(String[] args)
{
double a,v;
Scanner ob=new Scanner(System.in);
System.out.println("enter side of cube");
a=ob.nextDouble();
v=a*a*a;
System.out.println("volume of cube="+v); 
}
}