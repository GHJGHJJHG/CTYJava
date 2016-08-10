
public class PairOfDice 
{
	
	private int die1;
	private int die2;
	private final int FACES = 6;
	
	public PairOfDice()
	{
		roll();
	}
	
	public void roll()
	{
		die1 = (int) ((Math.random()*FACES)+1);
		die2 = (int) ((Math.random()*FACES)+1);
	}
	
	public String toString()
	{
		return "Die 1: " + die1 +
				"\tDie 2: " + die2; 
	}
	
	public boolean isSnakeEyes()
	{
		return ((die1 == 1) && (die2 == 1));
	}
	
	public boolean hasAOne()
	{
		return ((die1 == 1) || (die2 == 1));
	}
	
	public int getValue()
	{
		return die1+die2;
	}

}
