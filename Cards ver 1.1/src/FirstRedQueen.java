import java.util.Scanner;

public class FirstRedQueen {
	
	static CardDeck deck = new CardDeck("Standard");
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int numRuns;
		int[] posCount = new int[52];
		
		// Initializes posCount to 0. 
		for (int i = 0; i < 52; i++) posCount[i] = 0;
		
		System.out.print("Enter number of Runs: ");
		numRuns = keyboard.nextInt();
		keyboard.close();
		
		for (int i = 0; i < numRuns; i++)
		{
			deck.shuffle();
			
			// Increase index of place where first Queen found. 
			posCount[firstQueenIndex()]++;
		}
		
		for (int i = 0, p = 0; i < 52; i++, p = (p+26)%52) {
			System.out.print("Pos ");
			if (p < 9 ) System.out.print(" ");
			System.out.print((p+1) + ": \t\t" + posCount[p] + "\t\t");
			if (i%2==1) 			{
				p++;
				System.out.println();
			}
			
			//
		}
	}
	
	private static int firstQueenIndex()
	{
		for (int i = 0; i < deck.getSize(); i++)
		{
			Card singleCard =  deck.cardAt(i);
			
			// Check to see if red Queen, and if so, return i. 
			if (singleCard.getValue() == Card.QUEEN && (singleCard.getSuit() == "Heart" || singleCard.getSuit() == "Diamond"))
				return i;
		}
		
		// If method gets here, something has gone horribly wrong. 
		return -1;
	}
}
