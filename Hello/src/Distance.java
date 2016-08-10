import java.util.Scanner;


public class Distance {

	public static void main(String[] args) {
		double x1, x2, y1, y2;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the coordinates of the first point with a space between them as such: (x1 y1) ");
		x1 = keyboard.nextDouble();
		y1 = keyboard.nextDouble();
		
		System.out.print("Enter the coordinates of the second point with a space between them as such: (x1 y1) ");
		x2 = keyboard.nextDouble();
		y2 = keyboard.nextDouble();
		
		final double DISTANCE = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		
		System.out.printf("The distance between them is %f", DISTANCE);
		
	}

}
