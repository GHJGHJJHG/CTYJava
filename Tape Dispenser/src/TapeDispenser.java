
public class TapeDispenser{
	
	private int inchesLeft;
	private String owner;
	
	public TapeDispenser(int initialTape, String own)
	{
		owner = own;
		inchesLeft = initialTape;
	}
	
	public String getOwner() 
	{
		return owner;
	}
	
	public int getInchesRemaining() 
	{
		return inchesLeft;
	}
	
	public String toString()
	{
		return "Dispenser owner: " + owner + "\tInches remaining: " + inchesLeft;
	}
	
	public void dispense(int tapeLength)
	{
		if (tapeLength > inchesLeft)
		{
			//throw new IllegalArgumentException("You cannot take more tape than exists. ");
			System.err.println("You cannot take more tape than exists. ");
			return;
		}
		inchesLeft -= tapeLength;
	
	}
	
	

}
