import java.util.Scanner;


public class TicTacToe {

	public static void main(String[] args) {
		Board myBoard = new Board();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print(myBoard.toString() + '\n');
		int moveNo = 1;
		
		
		while (true)
		{
			if (moveNo == 9)
			{
				System.out.println("\nAhhhhh..... It's a Tie. ");
				System.out.print("\007");
				break;
			}
			
			moveNo++;
			myBoard.makeComputerMove();
			System.out.println(myBoard);
						
			if (myBoard.isWinner(Board.COMPUTER))
			{
				System.out.println("Winner = winner chicken dinner");
				System.out.println("Winner is " + Board.COMPUTER);
				break;
			}
			
			System.out.print("Put your '" + Board.USER + "' in what position: ");
			myBoard.makePlayerMove(keyboard.nextInt());
						
			if (myBoard.isWinner(Board.USER))
			{
				System.out.println("Winner = winner chicken dinner");
				System.out.println("Winner is " + Board.USER);
				break;
			}
			
		}

	}
	
	public static void clearScreen()
	{  //NOT IMPLEMENTED HERE YET
	}
	

}
