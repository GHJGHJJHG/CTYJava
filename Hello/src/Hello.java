/*

Hello.java, week 1

*/

public class Hello
{
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("Hello, World!");
		secondMethod();
	}
	
	private static void secondMethod() //This is a method that the main method calls. Private means only this class can call it. 
	{
		System.out.println("This is the second method.");
		System.out.println("The value of ¹ is " + Math.PI + "!");
	}

}
