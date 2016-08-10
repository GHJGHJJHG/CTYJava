// ********************************************************************
// Runs.java
//
// Finds the length of the longest run of heads in 100 flips of a coin.
// ********************************************************************

public class Runs
{
    public static void main (String[] args)
    {
	int flips = 100; // number of coin flips

	int currentRun = 0; // length of the current run of HEADS
	int maxRun = 0;     // length of the maximum run so far

	// Create a coin object
	BiasedCoin c = new BiasedCoin();
	// Flip the coin FLIPS times
	for (int i = 0; i < flips; i++)
	    {
			// Flip the coin & print the result
			c.flip();
			System.out.println(c); //Notice how c defaults to c.toString()
			
			// Update the run information
			if (c.isHeads())
			{
				currentRun++;
				
			}
			else
			{
				if (maxRun < currentRun) maxRun = currentRun;
				currentRun = 0;
			}
	
	    }
	
	//If the last few results were heads.
	if (maxRun < currentRun) maxRun = currentRun;
	currentRun = 0;

	// Print the results
	System.out.println();
	System.out.println("The maximum run of " + flips + (flips==1?" flip":" flips") + " is " + maxRun + (maxRun==1?" head":" heads") + " in a row.");
	
	System.out.println("Done. ");

    }
}
