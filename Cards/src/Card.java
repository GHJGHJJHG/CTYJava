/**Card Class used to construct card objects. 
 * Card objects have 2 basic properties, their rank and suit.
 * Rank is given as a value between [2, 14] where 11 is Jack, 12 is Queen, 13 is King, and 14 is Ace.
 *
 * @since JDK 1.6
 * @version 1.2
 */

public class Card implements Comparable<Card> {  
	
	/**Abstraction of value of Jack. */
	public final static int JACK  = 11;
	/**Abstraction of value of Queen. */
	public final static int QUEEN = 12;
	/**Abstraction of value of King. */
	public final static int KING  = 13;
	/**Abstraction of value of Ace. */
	public final static int ACE   = 14;
	
	private byte value;
	
	//Enumeration allows us to clearly define options for suit.
	
	public static enum Suit {
		SPADE("Spade", 'S'), HEART("Heart", 'H'), CLUB("Club", 'C'), DIAMOND("Diamonds", 'D');
		
				
		private String suitString;
		private char suitChar;
		
		//Here we define the format of each suit declaration.
		Suit(String suitString, char suitChar) {
			this.suitString = suitString;
			this.suitChar = suitChar;
		}
		
		public String toString() {
			return suitString;
		}
		
		public char toChar() {
			return suitChar;
		}
		
	}
	
	//Here we use our own suit. 
	private Suit suit;
	
	public Card(int value, Suit suit)
	{
		setSuit(suit);
		setValue(value);		
	}
	

	public Suit getSuit()
	{
		return this.suit;
	}
	
	public byte getValue()
	{
		return value;
	}
	
	//Cards should be immutable. For this reason, setSuit and setValue are private. 
	
	private void setSuit(Suit suitToSet)
	{
		this.suit = suitToSet;
	}
	
	private void setValue(int valueToSet)
	{
		if ((valueToSet < 2) || (valueToSet > 14))
				throw new IllegalArgumentException(
						"This method only accepts an integer value in the set of [2, 14]" +
								" where 11 is Jack, 12 is Queen, 13 is King, and 14 is Ace. ");
		else value = (byte) valueToSet;
	}
	
	public String toString()
	{
		switch (value)
		{
		case 11:
			return ("Jack of " + suit + "s");
		case 12:
			return ("Queen of " + suit + "s");
		case 13:
			return ("King of " + suit + "s");
		case 14:
			return ("Ace of " + suit + "s");
		default:
			return (value + " of " + suit + "s");
				
		}
	
	}
	/**@return A two-character shorthand representation of the card's value,
	 * where a value of 10 is T, Jack is J, and so on. 
	 */
	public String getCharRep()  //Gets a char representation of the card.
	{
		if (value < 10)
			return 	"" + value + suit.toChar();
		else
		{
			switch (value)
			{
			case 10: {return "T" + suit.toChar();}
			case 11: {return "J" + suit.toChar();}
			case 12: {return "Q" + suit.toChar();}
			case 13: {return "K" + suit.toChar();}
			case 14: {return "A" + suit.toChar();}
			default:  return "N";
			}
		}
		
	}

	//We use other.value instead of the getter because this happens within the card class, which can see all other cards. 
	@Override
	public int compareTo(Card other) {
		return (this.value - other.value);
	}
	
	public boolean equals(Card other) {
		return (this.value == other.value && this.suit == other.suit);
	}
}
