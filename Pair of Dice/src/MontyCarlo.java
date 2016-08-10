import java.util.Scanner;


public class MontyCarlo {
	
	public static void main(String args[])
	{
		PairOfDice dice = new PairOfDice();
		Scanner keyboard = new Scanner(System.in);
		int one = 0;
		int crap = 0;
		int seven = 0;
		
		System.out.print("Enter number of rolls: ");
		int numRolls = keyboard.nextInt();
		
		for (int i = 0; i < numRolls; i++)
		{
			dice.roll();
			if (dice.getValue() == 2 || dice.getValue() == 3 || dice.getValue() == 12)  crap++;
			if (dice.hasAOne()) one++;
			if (dice.getValue() == 7) seven++;
			
		}
		
		
		System.out.println("Number of times a one appeared on at least one die: " + one);
		System.out.println("Number of times craps (2, 3, 12) rolled           : " + crap);
		System.out.println("Number of times a seven was rolled                : " + seven);
		
		
	}

}
