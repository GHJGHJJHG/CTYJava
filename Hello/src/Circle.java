import java.util.Scanner;
public class Circle
{
	public static void main(String[] args)
	{
		nouserinput();
		userinput();
		
		
	}
	private static void nouserinput()
	{
		
		int radius = 10;
		double area = Math.PI*radius*radius;
		double circ = 2*Math.PI*radius;
		System.out.printf("The area of a circle with radius %d is %f\n", radius, area);
		System.out.printf("The circumference of a circle with radius %d is %f\n\n", radius, circ);

		
		radius = 20;
		area = Math.PI*radius*radius;
		circ = 2*Math.PI*radius;
		
		System.out.printf("The area of a circle with radius %d is %f\n", radius, area);
		System.out.printf("The circumference of a circle with radius %d is %f\n\n", radius, circ);
	}
	private static void userinput()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("I'm going to calculate the area of a circle.");
		System.out.print("What's the radius of your circle?\t");
		int radius = keyboard.nextInt();
		double area = Math.PI*radius*radius;
		double circ = 2*Math.PI*radius;
		
		System.out.printf("The area of a circle with radius %d is %f\n", radius, area);
		System.out.printf("The circumference of a circle with radius %d is %f\n\n", radius, circ);
		
		radius = radius*2;
		area = Math.PI*radius*radius;
		circ = 2*Math.PI*radius;
		
		System.out.printf("The area of a circle with radius %d is %f\n", radius, area);
		System.out.printf("The circumference of a circle with radius %d is %f\n\n", radius, circ);

	}
}
