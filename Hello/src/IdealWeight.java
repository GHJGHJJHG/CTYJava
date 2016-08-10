//Ideal Weight - Lab 2 Exercise 5

import java.util.Scanner;

public class IdealWeight {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//int feet;
		int inches;
		int weightF;
		int weightM;
		int weightActual;
		
		System.out.print("Input your height in feet: ");
		/*feet = */keyboard.nextInt();
		System.out.print("Input your height in inches: ");
		inches = keyboard.nextInt();
		
		weightF = 100 + inches*5;
		weightM = 106 + inches*6;
		
		System.out.printf("A comfortable weight range for you would be between %f and %f if you are male," + 
		" and between %f and %f if you are female.",  weightM*.85, weightM*1.15, weightF*.85, weightF*1.15);

		System.out.print("\nInput your weight: ");
		weightActual = keyboard.nextInt();
		
		System.out.print("Are you a boy or a girl? (boy/girl): ");
		String boyOrGirl = keyboard.next();
		
		System.out.println(boyOrGirl);
		if (boyOrGirl.toLowerCase().equals("boy"))
		{
			if ((weightActual < (weightM*1.15)) && (weightActual > (weightM*.85))) {
				System.out.println("\nYour weight is within the ideal weight range.");
			}
			else {
				System.out.println("\nYour weight is not within the ideal weight range. ");
			}
		}
		else if ((boyOrGirl.toLowerCase().equals("girl"))) {
			if ((weightActual < weightF*1.15) && (weightActual > weightF*.85)) {
				System.out.println("\nYour weight is within the ideal weight range.");
			}
			else {
				System.out.println("\nYour weight is not within the ideal weight range. ");
			}
		}

	}

}
