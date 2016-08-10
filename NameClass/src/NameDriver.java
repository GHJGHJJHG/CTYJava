import java.util.Scanner;


public class NameDriver {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Nobody declared with default constructor = ");
		
		while (true)
		{
			System.out.print("Enter first name (Done to end): ");
			
			String first = keyboard.nextLine();
			if (first.equalsIgnoreCase("Done")) break;
			
			System.out.print("Enter middle name             : ");
			
			String middle = keyboard.nextLine();
			
			System.out.print("Enter last name               : ");
			
			String last = keyboard.nextLine();
			
			Name person = new Name(first, middle, last);
			
			System.out.println();
			System.out.println("Test of name using toString: Name: " + person);
			System.out.println("Name using lastFirstMiddle method: " + person.lastFirstMiddle());
			System.out.println("Result of initials method        : " + person.initials());
			System.out.println("Number of characters in name     : " + person.length());
			System.out.println();
			
		}
		keyboard.close();
		
	}

}
