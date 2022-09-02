import java.util.Scanner;
class Arearectangle{
	public static void main(String[] args)
	{
		float b,l;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the breadth of rectangle : ");
		b=s.nextFloat();
		System.out.print("Enter the length of  rectangle : ");
		l=s.nextFloat();
		double area;
		area=l*b;
		System.out.print("Area of rectangle : "+area);
	}
}