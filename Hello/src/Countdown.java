/*
 *Hello.java, week 1
 */
public class Countdown
{
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("Hello, World!");
		slowType("Three... Two... One... \n", 150);
		
		System.out.println("LIFTOFF!!");
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
