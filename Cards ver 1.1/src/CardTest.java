public class CardTest {
	public static void main(String args[])
	{
		
		
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

	}

}
