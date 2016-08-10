/**Deck of playing cards
 * @since JDK 1.6
 * @version 1.2
 */

//TODO: Convert variant to Enumerated type. 

import java.util.ArrayList;
import java.util.Collections;

//import Card.Suit;

public class CardDeck {
	//private Card deck[] = new Card[52]; //Declare 52 cards
	/**ArrayList in which cards are sorted. */
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	/**Abstracts supported decks.*/
	public static enum Variant {
		
		
		STANDARD (2, Card.ACE +1),
		DURAK    (6, Card.ACE+1),
		EUCHRE   (9, Card.ACE+1);
				
		private int lowestRank, highestRank;
//		Card.Suit[] suits;
		
		Variant(int lowestRank, int highestRank /*, Card.Suit[] suits */)
		{
		
			this.lowestRank = lowestRank;
			this.highestRank= highestRank;
//			this.suits = suits;
		}
		
		public int lowestRank() {
			return lowestRank;
		}
		
		public int highestRank() {
			return highestRank;
		}
		
	}
	
	/**Copy for use by this object. */
	private Variant variant;
	
	/**Construct new standard deck of playing cards.*/
	public CardDeck() 
	{
		//ArrayList implementation:
		variant = Variant.STANDARD;
		create();
		
	}
	
	/**Construct new standard deck of playing cards according to given specifications.
	 * @param variant can be any variant that is supported by cards.
	 */
	public CardDeck(Variant variant) //Supported variants: "Standard", "Durak"
	{
		this.variant = variant;
		create();	
		
	}
	
	/**Shuffles all cards in deck.*/
	public void shuffle()
	{
		for (int i = 0; i < deck.size(); i++)
		{
			Collections.swap(deck, i, (int)(Math.random()*deck.size()));
		}
	}
	
	/**Sorts by suit in order ("Spade", "Heart", "Club", and "Diamond") , then by rank in descending order. */
	public void organize()
	{
		
		//Collections.sort(deck, Collections.reverseOrder());
		
		
		//Splits deck into respective suits.  
		ArrayList<Card> spades = new ArrayList<Card>();
		ArrayList<Card> hearts = new ArrayList<Card>();
		ArrayList<Card> clubs = new ArrayList<Card>();
		ArrayList<Card> diamonds = new ArrayList<Card>();
		
		//Sorts deck into suits.  
		for (Card card : deck)
			
			switch(card.getSuit())
			{
			case SPADE: {spades.add(card); break;}
			case HEART: {hearts.add(card); break;}
			case CLUB: {clubs.add(card); break;}
			case DIAMOND: {diamonds.add(card); break;}	
			default: System.err.println("Umm... So we screwed up somewhere and now you have a card that isn't a Spade, Heart, Club, or Diamond.");
			}
			
			
			
		
		//Sorts each suit by rank in descending order. . 
		Collections.sort(spades, Collections.reverseOrder());
		Collections.sort(hearts, Collections.reverseOrder());
		Collections.sort(clubs, Collections.reverseOrder());
		Collections.sort(diamonds, Collections.reverseOrder());
		
		//Compiles cards into deck. 
		deck.clear();
		deck.addAll(spades);
		deck.addAll(hearts);
		deck.addAll(clubs);
		deck.addAll(diamonds);
		
	}
	
	/**Constructs variant specific playing cards. 
 	 */
	private void create()
	{
		deck.clear();
			for (int i=variant.lowestRank; i<variant.highestRank; i++) deck.add(new Card(i, Card.Suit.SPADE));
			for (int i=variant.lowestRank; i<variant.highestRank; i++) deck.add(new Card(i, Card.Suit.HEART));
			for (int i=variant.lowestRank; i<variant.highestRank; i++) deck.add(new Card(i, Card.Suit.CLUB));
			for (int i=variant.lowestRank; i<variant.highestRank; i++) deck.add(new Card(i, Card.Suit.DIAMOND));
						
		
		
	}
	
	/**Returns Card object at index
	 * @param index Specifies index.
	 */ 
	public Card cardAt(int index)
	{
		return deck.get(index);
	}
	
	
	/**Returns amount of Cards in Deck.*/
	public int getSize()
	{
		return deck.size();
	}
	
	/**Prints each card's char representation with given amount of cards per line.
	 * Default is 4.
	 */
	public String toString()
	{
		String result = "";
		for (int i = 0; i < deck.size(); i+= 1)
		{
			result += deck.get(i).getCharRep() + " ";
			if (i % 4 == 3) result += "\n";
		}
		return result;
	}
	/**Prints each card's char representation with given amount of cards per line.
	 * @param wrap Defines amount of cards per line. Must be an integer greater than or equal to one. 
	 */
	public String toString(int wrap)
	{
		//Checks that wrap is valid. 
		if (wrap <= 0) throw new IllegalArgumentException(
				"The integer wrap must be a positive integer greater or equal to one. " + wrap + " is not a valid integer. "); 
		String result = "";
		for (int i = 0; i < deck.size(); i+= 1)
		{
			result += deck.get(i).getCharRep() + " ";
			if (i % 4 == 3) result += "\n";
		}
		return result;
	}
	
}
