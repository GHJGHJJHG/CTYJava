// Wrapper Class Demo			Author: G. Gonsalves
//
// Demo's use of Autoboxing features along with methods 
// of the Integer Wrapper class 
// NOTE: Double Wrapper Class is also on the Examp
// CHECK OUT YOUR AP SUBSET REGARDING THESE CLASSES
//
// As an exercise give the output to this program
public class IntegerWrapperDemo
{
	public static void main(String [] args)
	{
		// Create 3 Integer Objects
		Integer n1 = new Integer(9);
		Integer n2 = 6;						// Autoboxing feature now allowed
		Integer n3 = new Integer("9"); 
		
		System.out.println(n1.intValue() + " " + n2.intValue() + " " +
			               n3.intValue());
		// Allowed because of Autoboxing
		System.out.println(n1 + " " + n2 + " " + n3);
		
		System.out.println();
		// Integer Objects can be compared different ways
		System.out.println(n1.equals(n3));
		System.out.println(n1 == 9);		// OK because of Autoboxing
		System.out.println(n2.equals(n3));
		System.out.println(n1 == n2);		// OK because of Autoboxing

		System.out.println();
		// >, < and != can be used with Integer objects because of Autoboxing
		System.out.println(n1.compareTo(n2) > 0);
		System.out.println(n1 > n2);				// OK - Autoboxing
		System.out.println(n1.compareTo(2) < 0);	// OK - Autoboxing
		
		// Integer objects can now be used with primative ints in expressions
		int tot  = n1 + n2 + 100;						// Autoboxing
		int tot2 = n1.intValue() + n2.intValue() + 100;
		System.out.println("\n" + tot + "\n" + tot2);
	}
}