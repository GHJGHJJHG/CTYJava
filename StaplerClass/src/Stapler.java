/* This is a class that models a stapler. 
 */


public class Stapler
{
	
	private int capacity;
	private boolean isOpen;
	private int numStaples;

	public Stapler()
	{
		capacity= 250;
		isOpen = false;
		numStaples = 0;
	}
	
	public Stapler(int numS, int capa, boolean isO)
	{
		capacity= capa;
		isOpen = isO;
		numStaples = numS;
	}
	
	public Stapler(Stapler original)
	{ // New one being created from template original
		numStaples = original.numStaples;
		capacity = original.capacity;
		isOpen = original.isOpen;
	}
	
	public String toString()
	{
		return "The number of staples equals " + numStaples +
				" Capacity is " + capacity + 
				" The stapler is " + (isOpen ? "open": "closed");
	}
	
	public boolean isOpen() {return isOpen;}
	
	public void staple()
	{
		if (isOpen && numStaples > 0)
			numStaples--;
		else System.err.println("You don't have enough staples!");
	}
	
	public void openStapler()
	{
		isOpen = true;
	}
	
	public void closeStapler()
	{
		isOpen = false;
	}
	
	public void addStaples(int s)
	{
		if (s+numStaples <= capacity) numStaples += s;
		else System.err.println("The stapler is too small for that!");
	}
	
}
