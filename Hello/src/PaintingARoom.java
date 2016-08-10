import java.util.Scanner;

public class PaintingARoom {

	public static void main(String[] args) {
		int width;
		int length;
		int height;
		double costPerGallon;
		double gallonsNeeded;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter room width:  ");
		width = keyboard.nextInt();
		
		System.out.print("Enter room length:  ");
		length = keyboard.nextInt();
		
		System.out.print("Enter room height:  ");
		height = keyboard.nextInt();
		
		System.out.print("Enter cost per gallon:  ");
		costPerGallon = keyboard.nextDouble();
		
		gallonsNeeded = (((width+length)*height*2))/350.0;
		
		
		System.out.println("\nNumber of gallons needed: " + gallonsNeeded);
		System.out.println("Number of gallons needed: " + (int) Math.ceil(gallonsNeeded));
		
		System.out.println("\nCost of Paint:  $" + Math.ceil(gallonsNeeded)*costPerGallon);
	}

}
