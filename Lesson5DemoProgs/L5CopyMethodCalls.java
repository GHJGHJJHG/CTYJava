// Q of D
// Lesson 4
//
//  Trace it out and Give the output to this program
public class L5CopyMethodCalls
{
	public static void main(String [] args)
	{
		int n1 = 5, n2 = 9;
		String s1 = "Test4", s2 = "Spartans";

		switchStrings(s1, s2);
		System.out.println(s1 + "  " + s2);

		switchNums1(n1, n2);
		System.out.println(n1 + "  " + n2);

	}

	public static void switchStrings(String str1, String str2)
	{
		String temp = str1;
		str1 = str2;
		str2 = temp;
	}

	public static void switchNums1(int n1, int n2)
	{
		int temp = n1;
		n1 = n2;
		n2 = temp;
	}
}

