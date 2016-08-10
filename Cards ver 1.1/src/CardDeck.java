/**Deck of playing cards
 * @since JDK 1.6
 * @version 1.1
 */

//TODO: Convert variant to Enumerated type. 

import java.util.ArrayList;
import java.util.Collections;



public class CardDeck {
	
	//private Card deck[] = new Card[52]; //Declare 52 cards
	
	private ArrayList<Card> deck = new ArrayList<Card>();
	private String variant;
	
	/**Construct new standard deck of playing cards.*/
	public CardDeck() 
	{
		//Make new deck in order. <<FOR ARRAYS
		//for (int i=0; i<13; i++) deck[i] = new Card(i+2, "Spade");
		//for (int i=0; i<13; i++) deck[i+13] = new Card(i+2, "Heart");
		//for (int i=0; i<13; i++) deck[i+26] = new Card(i+2, "Club");
		//for (int i=0; i<13; i++) deck[i+39] = new Card(i+2, "Diamond");
		
		//ArrayList implementation:
		variant = "Standard";
		create("Standard");
		
	}
	
	/**Construct new standard deck of playing cards according to given specifications.
	 * @param var can be "Standard" or "Durak".
	 */
	public CardDeck(String var) //Supported variants: "Standard", "Durak"
	{
		variant = var;
		create(var);	
		
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
			if (card.getSuit() == "Spade") spades.add(card);
			else if (card.getSuit() == "Heart") hearts.add(card);
			else if (card.getSuit() == "Club") clubs.add(card);
			else if (card.getSuit() == "Diamond") diamonds.add(card);
			
		
		//Sorts each suit by rank. 
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
	 * @param var can be either "Standard" or "Durak".
	 */
	private void create(String var)
	{
		deck.clear();
		if (variant == "Durak")	
		{
			for (int i=4; i<13; i++) deck.add(new Card(i+2, "Spade"));
			for (int i=4; i<13; i++) deck.add(new Card(i+2, "Heart"));
			for (int i=4; i<13; i++) deck.add(new Card(i+2, "Club"));
			for (int i=4; i<13; i++) deck.add(new Card(i+2, "Diamond"));
						
		}
		else if (variant == "Standard")
		{
			for (int i=0; i<13; i++) deck.add(new Card(i+2, "Spade"));
			for (int i=0; i<13; i++) deck.add(new Card(i+2, "Heart"));
			for (int i=0; i<13; i++) deck.add(new Card(i+2, "Club"));
			for (int i=0; i<13; i++) deck.add(new Card(i+2, "Diamond"));
					
		}
		else throw new IllegalArgumentException("The currently supported decks are \"Standard\", \"Durak\", and \"Hand\".");
		
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
