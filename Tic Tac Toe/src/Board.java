
public class Board {
	
	private char currentBoard[] = new char[10];
	
	public static final char COMPUTER = 'X';
	public static final char USER = 'O';
	
	public Board() {
		currentBoard[0] = '1';
		currentBoard[1] = '2';
		currentBoard[2] = '3';
		currentBoard[3] = '4';
		currentBoard[4] = '5';
		currentBoard[5] = '6';
		currentBoard[6] = '7';
		currentBoard[7] = '8';
		currentBoard[8] = '9';
		//{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
	}
	
	public String toString()
	{
		return currentBoard[0] + " " + currentBoard[1] + " " + currentBoard[2] + "\n" +
				currentBoard[3] + " " + currentBoard[4] + " " + currentBoard[5] + "\n" +
				currentBoard[6] + " " + currentBoard[7] + " " + currentBoard[8] + "\n";
	}
	
	public void makeComputerMove()
	{
		int compChoice;
		while (true)
		{
			compChoice = (int)(Math.random() * 9);
			if (currentBoard[compChoice] != USER && currentBoard[compChoice] != COMPUTER)
				break;

		}
		
		currentBoard[compChoice] = COMPUTER;
	}
	
	
	/*public void makeLethalComputerMove()
	 
	{
		int positionsAvailable;
		for (char position : currentBoard)
			if (position != USER && position != COMPUTER)
		
	}
	*/
	public void makePlayerMove(int pos)
	{
		currentBoard[pos-1] = USER;
	}
	
	
	
	public boolean isWinner(char c)
	{
		return (
				//Checks for horizontal wins
				(currentBoard[0] == c && currentBoard[1] == c && currentBoard[2] == c) || 
				(currentBoard[3] == c && currentBoard[4] == c && currentBoard[5] == c) || 
				(currentBoard[6] == c && currentBoard[7] == c && currentBoard[8] == c) || 
				
				//Checks for vertical solutions
				(currentBoard[0] == c && currentBoard[3] == c && currentBoard[6] == c) || 
				(currentBoard[1] == c && currentBoard[4] == c && currentBoard[7] == c) || 
				(currentBoard[2] == c && currentBoard[5] == c && currentBoard[8] == c) || 
				
				//Checks for diagonal solutions
				(currentBoard[0] == c && currentBoard[4] == c && currentBoard[8] == c) || 
				(currentBoard[2] == c && currentBoard[4] == c && currentBoard[6] == c) );

				
				
	}

}
