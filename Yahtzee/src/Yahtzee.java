import java.util.Scanner;

public class Yahtzee {

	
	public static void main(String[] args) {
		
		int rollsNeeded, yahtzeesRolled = 0;
		boolean verboseRolls = false;
		Scanner keyboard = new Scanner(System.in);
					
		//Input
		System.out.print("How many rolls? ");
		rollsNeeded = keyboard.nextInt();
		keyboard.nextLine();
		System.out.print("Do you want to see the rolls (y/N) ");
		if (keyboard.nextLine().toUpperCase().charAt(0) == 'Y')
			verboseRolls = true;
		
		
	//Prints individual rolls
		for(int i = 0; i < rollsNeeded; i++)
		{
		
		//Roll generation
			int n1 = (int) (Math.random()*6 + 1);
			int n2 = (int) (Math.random()*6 + 1);
			int n3 = (int) (Math.random()*6 + 1);
			int n4 = (int) (Math.random()*6 + 1);
			int n5 = (int) (Math.random()*6 + 1);
			
		/* For debugging. 
		 	System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n4);
			System.out.println(n5);
		 */
			
			if (verboseRolls == true)
				System.out.println("Roll\t" + (i+1) + "\t\t" + n1 + ' ' + n2 + ' ' + n3 + ' ' + n4 + ' ' + n5);
			if (match5(n1, n2, n3, n4, n5))
				yahtzeesRolled++;
			
					
		}
		//Prints stats ****TO BE FORMATTED
		System.out.println("In " + rollsNeeded + " you rolled " + yahtzeesRolled + " Yahtzees. ");
		System.out.println("You rolled a Yahtzee " + (((double)yahtzeesRolled*100)  / rollsNeeded) + " percent of the time.");
		
		
		
		

	}
	

	
	private static boolean match5(int n1, int n2, int n3, int n4, int n5) 
	{
		if (n1 == n2 && n2 == n3 && n3 == n4 && n4 == n5)
			return true;
		else
			return false;
	}
	
	

}
