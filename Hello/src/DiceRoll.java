
public class DiceRoll {

	public static void main(String[] args) {
		int firstRoll = (int) (Math.random()*6) + 1;
		int secondRoll = (int) (Math.random()*6) + 1;
		System.out.printf("The first die rolled a %d and the second rolled a %d. Their total is %d. \n", firstRoll, secondRoll, firstRoll+secondRoll);
	
	}

}
