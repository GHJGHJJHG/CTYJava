
public class CardOrganizeTest {
	public static void main(String args[])
	{
		
		//Functions as a playground. 
		CardDeck deck = new CardDeck("Standard");

		System.out.println("The un-shuffled deck: ");
		System.out.println(deck.toString());
		System.out.println();

		deck.shuffle();
		
		deck.shuffle();
		
		System.out.println("The shuffled deck: ");
		System.out.println(deck.toString());
		
		deck.organize();
		

		System.out.println("The organized deck: ");
		System.out.println(deck.toString());
		
		System.out.println(   (new Card(Card.ACE, "Club")).compareTo(new Card( Card.JACK, "Spade"))    );
	}

}
