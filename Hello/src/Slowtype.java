import java.util.Scanner;

public class Slowtype
{
	public static void main(String args[]) throws InterruptedException
	{
		Scanner keyboard = new Scanner(System.in);
		String input = ""; 
		String totalInput = "";
		
		while (true)
		{
			if (!(keyboard.hasNextLine()))
				break;
			
			input = keyboard.nextLine();
			totalInput += input  + "\n";
	
			
		}
		
		slowType(totalInput, 90);

		
	}
	
	
	private static void slowType(final String INPUT, final long WAIT_TIME) throws InterruptedException
		{  
			for(int i=0; i<INPUT.length(); i++)
			{
				System.out.print(INPUT.charAt(i));
				Thread.sleep(WAIT_TIME);
			}
		}
}
