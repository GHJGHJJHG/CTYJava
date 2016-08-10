import java.util.Scanner;


public class CharacterCount {

	public static void main(String[] args) {
		String input = "";
		String totalInput = "";
		Scanner keyboard = new Scanner(System.in);
		int digits=0, vowels=0, whitespace=0, punctuation=0, alphabet=0, other=0; //Vowels includes 'y'. Punctuation is {.|?|,}
		int linesProcessed = -1; //For done line.
		
		System.out.println("Enter \"DONE\" when you are through.");
		
		
		while (!(input.equals("DONE")))
		{
			totalInput += input /* + "\n"*/;
			System.out.print("Enter a line of text or DONE: ");
			
			// Leave these lines at bottom. 
			input = keyboard.nextLine();
			linesProcessed++;
			
			
		}
		
		for (char letter: totalInput.toCharArray()) { //Enhanced for loop walks through each char primitive in an array. 
			
			//Following if statement is for vowels.
			if ( (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'Y') ||
			     (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'y') )
			{vowels++;}
			
			//What follows are mutually exclusive groups. 
			if (Character.isDigit(letter)) digits++;
			else if (Character.isWhitespace(letter)) whitespace++;
			else if (letter == '?' || letter == ',' || letter == '.' ) punctuation++;
			else if (Character.isLetter(letter)) alphabet++;
			else other++;
			
		}
		/* The following lines are for testing. 
		System.out.println(digits);
		System.out.println(vowels);
		System.out.println(whitespace);
		System.out.println(punctuation);
		System.out.println(alphabet);
		System.out.println(other);
		System.out.println(linesProcessed);
		*/
		
				
		System.out.println("Alphabetic character count : " + alphabet);
		System.out.println("Vowel Count                : " + vowels);
		System.out.println("Digit Count                : " + digits);
		System.out.println("Blank space count          : " + whitespace);
		System.out.println("Punctuation count          : " + punctuation);
		System.out.println("Number of other characters : " + other);
		System.out.println("Number of lines processed  : " + linesProcessed);
		System.out.println("\nThat's all, folks....");
		

	}

}
