import java.util.Random;
import java.util.Scanner;

/**
 * @since Oracle JDK 1.6.0
 * @version 1.0
 */

public class YahtzeeMontyCarlo 
{
	
	public static void main(String[] args)
	{
		
		int firstRoll = 0, secondRoll = 0, thirdRoll = 0;
		int totalRolls;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many trials? ");
		totalRolls = keyboard.nextInt();
		
		
		for(int i = 0; i < totalRolls; i++)
		{
			switch (rollForBest()) //Split off from main method for sake of code readability 
			{
			case 1: {firstRoll++; break;}
			case 2: {secondRoll++; break;}
			case 3: {thirdRoll++; break;}
			}
		}
		System.out.println("\nYahtzee count = " + (firstRoll+secondRoll+thirdRoll));

		System.out.println("\nPercentages of Yahtzee for  " + totalRolls + " rolls is: " + ((double)(firstRoll+secondRoll+thirdRoll)*100/totalRolls) + " percent. ");
		System.out.println("\tYahtzee on first roll : " + firstRoll + " times");
		System.out.println("\tYahtzee on second roll: " + secondRoll + " times");
		System.out.println("\tYahtzee on third roll : " + thirdRoll + " times");
		
//		System.out.println((double)(firstRoll+secondRoll+thirdRoll)/totalRolls);
	}
	
	
	
	private static int rollForBest() // Return in how many rolls we got Yahtzee. If no Yahtzee has been achieved, we just return 0. 
	{
		Random randomRoll = new Random();
		//Start each die at a value where it cannot possibly be equal to preferredRolls
		byte[] dice = {(byte) 9, (byte) 9, (byte) 9, (byte) 9, (byte) 9};
		
		int preferredRoll = 0;  //Start preferredRoll at a value where it cannot possibly be equal to any die. 
		
		
		for(byte i=0; i < 3; i++)
		{	//Reset number of rolls for each. . 
			byte no1 = 0, no2 = 0, no3 = 0, no4 = 0, no5 = 0, no6 = 0;
			
			for (int j = 0; j < dice.length; j++) //Roll die.
			{
				//If die is not the preferred roll, re=roll.
				if (dice[j] != preferredRoll) dice[j] = (byte) (randomRoll.nextInt(6) + 1);
				//Debugging System.out.print("" + die + " ");
				switch (dice[j]) { //Count amount of rolls of each type
				case 1: {no1++; break;}
				case 2: {no2++; break;}
				case 3: {no3++; break;}
				case 4: {no4++; break;}
				case 5: {no5++; break;}
				case 6: {no6++; break;}
				}
			}
			
			//System.out.println();
			
			//set preferredRoll
			preferredRoll = (setPreferedRoll(no1, no2, no3, no4, no5, no6));
			
			if (dice[0]  == dice[1] && dice[1]  == dice[2] && dice[2]  == dice[3] && dice[3]  == dice[4]) return i+1;
		}
		
		return 0;
	}
	
	private static int setPreferedRoll(byte no1, byte no2, byte no3, byte no4, byte no5, byte no6) //Needed by rollForBest
	{
		int preferredRoll = 0;
		
		if ((no1 > no2) && (no1 > no3) && (no1 > no4) && (no1 > no5) && (no1 > no6)) preferredRoll = 1;
		else if (no2 > no3 && no2 > no4 && (no2 > no5) && (no2 > no6)) preferredRoll = 2;
		else if ((no3 > no4) && (no3 > no5) && (no3 > no6)) preferredRoll = 3;
		else if ((no4 > no5) && (no4 > no6)) preferredRoll = 4;
		else if (no5 > no6) preferredRoll = 5;
		else preferredRoll = 6;
		
		return preferredRoll;
	}
	

}
