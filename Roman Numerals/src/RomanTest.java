
// *************************************************************
// RomanTest - test program for Roman Numeral Class
//
// Author: G. Gonsalves

// NOTE: Uncomment the lines to test your code as you develop your program.
//       That is, write one method at a time and test it  
public class RomanTest
{
	public static void main(String[] args)
	{
		// Declare 3 RomanNumerals - note 3 diff. constructors
		RomanNumeral rn1 = new RomanNumeral();
		RomanNumeral rn2 = new RomanNumeral("MMII");
		RomanNumeral rn3 = new RomanNumeral(1437);
		
		// Test to see if they are created correctly - needs toString to debug
		System.out.println("Value of rn1 is : " + rn1);
		System.out.println("Value of rn2 is : " + rn2);
		System.out.println("Value of rn3 is : " + rn3);
		
		// Test arithmetic operations on our roman numerals
		rn1 = rn2.add(rn3);
		System.out.println("\nAfter Addition value of rn1 is : " + rn1);
		rn1 = rn2.subtract(rn3);
		System.out.println("\nAfter Subtraction value of rn1 is : " + rn1);

		// need to make rn2 and rn3 smaller for multiplication
		rn2 = new RomanNumeral("CII");
		rn3 = new RomanNumeral(27);
		System.out.println("\nValue of rn2 is : " + rn2);
		System.out.println("Value of rn3 is : " + rn3);
		rn1 = rn2.multiply(rn3);
		System.out.println("\nAfter Multiplication value of rn1 is : " + rn1);
		rn1 = rn2.divide(rn3);
		System.out.println("\nAfter Division value of rn1 is : " + rn1);
	}
}
		