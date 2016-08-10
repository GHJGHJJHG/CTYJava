import java.util.Scanner;

public class ReverseGuessingGame {

	public static void main(String[] args) {
		int upperLimit = 1000;
		int lowerLimit = 0; ////Exclusive
		int guess = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Think of a number between 1 and 1000. Write it town, no cheating.");
		System.out.println("I bet I can guess your number by asking you 11 questions or less -");
		System.out.println("and you only have to answer Yes or No. \nHere we go.\n");
		
		while (true)
		{
			guess++;
			
			
			int middle = (upperLimit-lowerLimit)/2;
			
			System.out.print(guess + ".\tIs your number bigger than " + (lowerLimit+middle) + " (y/n) ? ");
			
			
			if (keyboard.nextLine().charAt(0) == 'y')
			{
				lowerLimit += middle;
			}
			else upperLimit -= middle;
			
			System.out.println(lowerLimit + "\t" + upperLimit);
			
			
			//System.out.println(lowerLimit+ "\t" + range );
			
			
			
			if (upperLimit == lowerLimit+1) 
				{
				break;
				}
		}
		
		guess++;
		System.out.print(guess + ". Is your number " + lowerLimit + " ? ");
		if (keyboard.nextLine().charAt(0) == 'y')
			System.out.println("***** Yea, I got it in only " + guess + " questions! Pretty good huh.");
		else
System.out.println("Then your number must be " + upperLimit + ". It took me " + guess + " guesses to get it. ");
		
		
		
		guess++;
		
	}

}
