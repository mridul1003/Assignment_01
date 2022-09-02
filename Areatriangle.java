import java.util.Scanner;
class Areatriangle{
	public static void main(String[] args)
	{
		float a,b,c;
		double s,area;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Ist side : ");
		a=sc.nextFloat();
		System.out.print("Enter the IInd side : ");
		b=sc.nextFloat();
		System.out.print("Enter the IIIrd side : ");
		c=sc.nextFloat();
		s=(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.print("Area of Triangle = "+area);
	}
}