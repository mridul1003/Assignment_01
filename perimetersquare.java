import java.util.Scanner;
class perimetersquare
{
public static void main(String[] args)
{
double s,p;
Scanner ob=new Scanner(System.in);
System.out.println("enter side of square");
s=ob.nextDouble();
p=4*s;
System.out.println("Perimeter of square="+p); 
}
}