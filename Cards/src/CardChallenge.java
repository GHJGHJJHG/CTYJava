/**Challenge counterpart to card class. 
 * @deprecated Support has been halted since version 1.2 of Card and CardDeck
 * @version 1.2
 */

public class CardChallenge {
	
	public static void main(String[] args)
	{
		CardDeck deck = new CardDeck(CardDeck.Variant.STANDARD);
		
		deck.shuffle();
		
		System.out.println("Random unsorted hand");
		for (int i=0; i < 13; i++)
			System.out.println(deck.cardAt(i).getCharRep() + "\t" + deck.cardAt(i).getValue());
		
		System.out.println();
		
		
		@SuppressWarnings("unused")
		Card[] hand = new Card[13];
		
		System.out.print("hand sorted by value. ");
		
	}

}
