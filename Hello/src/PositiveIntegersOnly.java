import java.util.Scanner;

public class PositiveIntegersOnly {

	public static void main(String[] args) {
		int input= Integer.MIN_VALUE;
			
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a positive integer. If you don't, I'll be mad at you.  :\t" );
		input = keyboard.nextInt();
		while (input <= 0)
		{
			System.out.print("I'm mad at you. Enter a positive number now.  :\t" );
			input = keyboard.nextInt();
		}
		
		System.out.println("Congratulations! You entered " + input + "!");

	}

}
