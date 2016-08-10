
public class DiceDriver {
	public static void main(String args[])
	{
		PairOfDice dice = new PairOfDice();
		
		for (int i=0; i<5; i++)
		{
			System.out.println(dice.toString());
			System.out.println("Dice total: "+ dice.getValue());
			if (dice.hasAOne()) System.out.println("This roll has a one");
			if (dice.isSnakeEyes()) System.out.println("This roll is Snake Eyes");
			dice.roll();
			System.out.println();
			if (dice.isSnakeEyes()) break;
		}
	}

}
