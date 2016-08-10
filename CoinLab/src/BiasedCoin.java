// *******************************************************************
//   Coin.java            Author: Lewis and Loftus
//
//   Represents a coin with two sides that can be flipped.
// *******************************************************************

public class BiasedCoin
{
    public static final int HEADS = 0; //static keyword inserted by me.
    public static final int TAILS = 1; //static keyword inserted by me. 
    private double bias; //Bias to be heads

    private int face;

    // ---------------------------------------------
    //   Sets up the coin by flipping it initially.
    // ---------------------------------------------
    public BiasedCoin ()
    {
    bias = .5;
	flip();
    }
    
    public BiasedCoin (double bias)
    {
    this.bias = bias;
	flip();
    }

    // -----------------------------------------------
    //   Flips the coin by randomly choosing a face.
    // -----------------------------------------------
    public void flip()
    {
		if (Math.random() < bias) face=HEADS;
    	else face=TAILS;    	
    }

    // -----------------------------------------------------
    //   Returns the current face of the coin as an integer.
    // -----------------------------------------------------
    public int getFace()
    {
	return face;
    }

    // ----------------------------------------------------
    //   Returns the current face of the coin as a string.
    // ----------------------------------------------------
    public String toString()
    {
	String faceName;

	if (face == HEADS)
	    faceName = "Heads";
	else
	    faceName = "Tails";

	return faceName;
    }
    
    public boolean isHeads()
    {
    	return (face==HEADS);
    }
}
