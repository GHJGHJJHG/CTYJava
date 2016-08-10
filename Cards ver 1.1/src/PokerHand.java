import java.util.Scanner;


public class PokerHand {

	public static void main(String[] args) {
		
		CardDeck deck = new CardDeck("Standard");
		Scanner keyboard = new Scanner(System.in);
		int hands;
		int pairs = 0;
		boolean verboseHands;
		
		//Initialize important variables by asking for user input. 
		System.out.print("Deal how many poker hands: ");
		hands = keyboard.nextInt();
		keyboard.nextLine();
		System.out.print("Display hands (Y/N)? ");
		switch (keyboard.nextLine().charAt(0))
		{
		case 'Y': {verboseHands = true; break;}
		case 'y': {verboseHands = true; break;}
		default: verboseHands = false;
		}
		
		System.out.println();
		
		for (int i = 0; i < hands; i++)
		{
			Card[] currentHand = new Card[5];
			
			deck.shuffle();
			
			for (int j = 0; j < 5; j++)
				currentHand[j] = deck.cardAt(j);
			
			currentHand = sortCard(currentHand);
			//Checks for pair
			boolean pairExists = (currentHand[0].getValue() == currentHand[1].getValue() ||
					currentHand[1].getValue() == currentHand[2].getValue() ||
					currentHand[2].getValue() == currentHand[3].getValue() ||
					currentHand[3].getValue() == currentHand[4].getValue() );
			
			if (pairExists) pairs++;
			
			if (verboseHands)
			{
				for (Card c : currentHand) 
					System.out.print(c.getCharRep() + " ");
				if (pairExists) System.out.print("Yes");
				else System.out.print("No");
				System.out.println();
			}
		}
		
		System.out.println("\nIn " + hands + " trials there were " + pairs + " hands with at least a pair. ");
		System.out.println("Pair frequency: " + ((double) (pairs)*100 / hands) +  "%");
		
		keyboard.close();
	}

	/** Sorts through the card with selection sort. */
	private static Card[] sortCard(Card[] hand)
	{
		
		for (int i = 0; i < hand.length; i++)
		{
			for (int j = i; j < hand.length; j++)
			{
				if (hand[j].getValue() < hand[i].getValue())
				{
					Card temp = hand[i];
					hand[i] = hand[j];
					hand[j] = temp;
				}
				
			}
		}	
		
		return hand;
	}
}
