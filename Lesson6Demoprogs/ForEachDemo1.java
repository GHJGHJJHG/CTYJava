// for each loop demo
//
// demo1 - shows use of for each loop for 
//         stepping thru an array of primatives
public class ForEachDemo1
{
	public static void main(String [] args)
	{
		int [] ray1 =  {5, 22, 33, 44, 55, 66};
		

		for (int i: ray1)
		{
			i += 1;
			System.out.println(i);
		}


		// for each loop: read as for each int i in the array ray 1 ...
		// NOTE: i is NOT an index here in effect i = EACH element in 
		//       the array one at a time 
		for (int i: ray1)
			System.out.println(i);
		
		int tot = 0;
		for (int j: ray1)
			tot += j;
		System.out.println("Total is: " + tot);
	}
}