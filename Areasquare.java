import java.util.Scanner;
class Areasquare{
	public static void main(String[] args)
	{
		float s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side of the square : ");
		s=sc.nextFloat();
		double area;
		area=s*s;
		System.out.print("Area of square = "+area);
	}
}