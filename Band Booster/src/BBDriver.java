import java.util.Scanner;
import java.text.DecimalFormat;

public class BBDriver {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat money = new DecimalFormat("$###.00");
		
		BandBooster firstBooster = new BandBooster("Andrew");
		BandBooster secondBooster = new BandBooster("Ashley");
		
		//Get information 
		System.out.print("Enter number of Type 1 sold for " + firstBooster.getName() + ": ");
		int temp1 = keyboard.nextInt();
		System.out.print("Enter number of Type 2 sold for " + firstBooster.getName() + ": ");
		int temp2 = keyboard.nextInt();
		
		firstBooster.updateBarsSold(temp1, temp2);
		
		System.out.println();
		System.out.print("Enter number of Type 1 sold for " + secondBooster.getName() + ": ");
		temp1 = keyboard.nextInt();
		System.out.print("Enter number of Type 2 sold for " + secondBooster.getName() + ": ");
		temp2 = keyboard.nextInt();
		
		secondBooster.updateBarsSold(temp1, temp2);
			
		System.out.println(firstBooster.getName() + " earned " + money.format(firstBooster.moneyEarned()));
		System.out.println(secondBooster.getName() + " earned " + money.format(secondBooster.moneyEarned()));
		
		System.out.println(firstBooster);
		System.out.println(secondBooster);
		
		
		
		
		

	}

}
