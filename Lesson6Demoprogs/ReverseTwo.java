// Answers Lesson 6 - Question 3 homework #1 on arrays - 
//
public class ReverseTwo
{
	public static void main(String [] args)
	{
		int [] ray1 = {5, 6, 7, 8};
		int [] ray2 = {25, 26, 27, 28};
	
		swapem(ray1, ray2);
		
		for (int i =0; i < ray1.length; i++)
		  System.out.print(ray1[i] + " ");
		System.out.println();
		for (int i =0; i < ray2.length; i++)
		  System.out.print(ray2[i] + " ");
		  
		System.out.println();
		
	}
	
	// NOTE: This method swaps EACH element.  Can we do
	//       it another way? 
	// precondition: r1 and r2 are of the same length
	// postcondition: swaps the values
	public static void swapem(int [] r1, int [] r2)
	{
		int temp;
		
		for (int i = 0; i < r1.length; i++)
		{
			temp = r1[i];
			r1[i] = r2[i];
			r2[i] = temp;
		}

		// alternative way - does it work?
//		int [] temp;
//		temp = r1;
//		r1 = r2; 
//		r2 = temp;

	}
}




/*

// Alternate way - note As a method this will NOT work
// works if correct code is placed in the main program
	public static void swapem(int [] r1, int [] r2)
	{
		int [] tempRay = new int[r1.length];
		
		tempRay = r1;
		r1 = r2;
		r2 = r1;
	}


	// Correct way if a method is used
	public static void swapem(int [] r1, int [] r2)
	{
		int temp;
		
		for (int i = 0; i < r1.length; i++)
		{
			temp = r1[i];
			r1[i] = r2[i];
			r2[i] = temp;
		}
	}

*/