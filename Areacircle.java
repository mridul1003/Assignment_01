import java.util.Scanner;
class Areacircle{
	public static void main(String[] args)
	{
		float r;
		double pi=3.14,a;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		r=s.nextFloat();
		a=pi*r*r;
		System.out.println("Area of the circle = "+a); 
	}
}