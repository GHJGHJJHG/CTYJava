
public class FractDriver {

	public static void main(String[] args) {
		Fraction f1 = new Fraction (3, 4);
		Fraction f2 = new Fraction (2, 3);
		
		System.out.println(f1);
		System.out.println(f2);
		
		Fraction f3 = f1.add(f2);
		System.out.println(f3);
				
		f3 = f1.subtract(f2);
		System.out.println(f3);
		
		f3 = f1.multiply(f2);
		System.out.println(f3);
		
		System.out.println(f1.toDecimal());
		System.out.println(f2.toDecimal());
		
		f1 = f3;
		System.out.println(f1.equals(f3));
		
	}

}
