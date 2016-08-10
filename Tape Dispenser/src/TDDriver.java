
public class TDDriver {

	public static void main(String[] args) {
		TapeDispenser dispenserOne = new TapeDispenser(100, "Albert Einstein");
		TapeDispenser dispenserTwo = new TapeDispenser(70, "Allan Turing");
		//TapeDispenser dispenserThree = new TapeDispenser(54, "The Real Socrates");
		
		System.out.println(dispenserOne);
		System.out.println(dispenserTwo);
		
		System.out.println("Dispensing 5 inches of tape. ");
		dispenserOne.dispense(5);
		dispenserTwo.dispense(80);
		System.out.println(dispenserOne);
		System.out.println(dispenserTwo)
		
		;

	}

}
