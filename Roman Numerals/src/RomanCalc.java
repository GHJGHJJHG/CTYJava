import java.util.Scanner;


public class RomanCalc {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		char operator = ' ';
		String str1 = "d", str2 = "d" ;
		
		while (str1.charAt(0) != 'Z' && str2.charAt(0) != 'Z' && operator != 'D')
		{
			System.out.print("Enter first Roman numeral (Z to quit)     :\t");
			str1 = keyboard.nextLine();
			if (str1.charAt(0) == 'Z') continue;
			RomanNumeral rn1 = new RomanNumeral(str1);
			
			System.out.print("Enter second Roman numeral                :\t");
			str2 = keyboard.nextLine();
			if (str1.charAt(0) == 'Z') continue;
			RomanNumeral rn2 = new RomanNumeral(str2);
			
			System.out.print("Enter operation (+, -, / or D for Done)   :\t");
			
			operator = keyboard.nextLine().charAt(0);
			if (operator == 'D') continue; 
			
			System.out.println();
			System.out.println("First RN	:\t" + rn1.toString());
			System.out.println("First RN	:\t" + rn1.toString());
			
			switch (operator) {
			case '+': {
				System.out.println("Result of + " + rn1.add(rn2));
				break;
			}
			case '-': {
				System.out.println("Result of - " + rn1.subtract(rn2));
				break;
			}
			case '/': {
				System.out.println("Result of / " + rn1.divide(rn2));
				break;
			}
			case '*': {
				System.out.println("Result of * " + rn1.multiply(rn2));
				break;
			}
			default: {
				System.out.println("***** Invalid Operator. *****");
			}
			
			}
		}
	}

}
