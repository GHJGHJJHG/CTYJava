import java.util.Scanner;

// ***************************************************************
//   StringManips.java
//
//   Test several methods for manipulating String objects
// ***************************************************************
public class StringManips
{
    public static void main (String[] args)
    {
	String phrase = new String ("This is a String test.");
	int phraseLength;   // number of characters in the phrase String
	int middleIndex;    // index of the middle character in the String
	String firstHalf;   // first half of the phrase String
	String secondHalf;  // second half of the phrase String
	String switchedPhrase; // a new phrase with original halves switched
	Scanner keyboard = new Scanner(System.in);
	String city;
	String state;
	

	// compute the length and middle index of the phrase
	phraseLength = phrase.length();
	middleIndex = phraseLength / 2;

	// get the substring for each half of the phrase
	firstHalf = phrase.substring(0,middleIndex);
	secondHalf = phrase.substring(middleIndex, phraseLength);

	// concatenate the firstHalf at the end of the secondHalf
	switchedPhrase = secondHalf.concat(firstHalf);
	switchedPhrase = switchedPhrase.replace(' ', '*');

	// print information about the phrase
	System.out.println();
	System.out.println ("Original phrase: " + phrase);
	System.out.println ("Length of the phrase: " + phraseLength +
			    " characters");
	System.out.println ("Index of the middle: " + middleIndex);
	System.out.println ("Character at the middle index: " + 
			    phrase.charAt(middleIndex));
	System.out.println ("Switched phrase: " + switchedPhrase);
	
	String middle3 = phrase.substring(middleIndex-1, middleIndex+2);
	System.out.printf("The middle 3 characters are %s\n ", middle3);
	
	System.out.print("Hey, what is your city?");
	city = keyboard.nextLine();
	System.out.print("What is your state?");
	state = keyboard.nextLine();

	System.out.print(state.toUpperCase()+city.toLowerCase()+state.toUpperCase());
	
	System.out.println();
    }
}
