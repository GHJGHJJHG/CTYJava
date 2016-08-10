import java.util.Scanner;


public class MontyCarlo2 {
	
	public static void main(String args[])
	{
		PairOfDice dice = new PairOfDice();
		Scanner keyboard = new Scanner(System.in);
		int countOf = 0;
		
		System.out.print("Enter number of rolls: ");
		int numRolls = keyboard.nextInt();
		System.out.print("Enter dice total to count: ");
		int toCount = keyboard.nextInt();
		for (int i = 0; i < numRolls; i++)
		{
			dice.roll();
			if (dice.getValue() == toCount)  countOf++;
		}
		
		
		System.out.println("In " + numRolls + " the number " + toCount + " appeared " + countOf + " times. ");

	}

}
