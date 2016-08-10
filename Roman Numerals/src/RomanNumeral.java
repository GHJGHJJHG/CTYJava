
public class RomanNumeral {
	public final static int M = 1000;
	public final static int D = 500;
	public final static int C = 100;
	public final static int L = 50;
	public final static int X = 10;
	public final static int V = 5;
	public final static int I = 1;
	
	private int value;
	
	public RomanNumeral()
	{
		value = 0;
	}
	public RomanNumeral(int input)
	{
		value = input;
	}
	public RomanNumeral(String input)
	{
		value = toInt(input);
	}
	
	public int toInt()
	{
		return value;	
	}
	
	public static int toInt(String input)
	{
		int result = 0;
		for(char ch : input.toCharArray())
		{
		if (ch == 'M')  result += M;
		else if (ch == 'D') result += D;
		else if (ch == 'C') result += C;
		else if (ch == 'L') result += L;
		else if (ch == 'X') result += X;
		else if (ch == 'V') result += V;
		else if (ch == 'I') result += I;
		}
		
		return result;
		
	}
	public String toString()
	{
		return ("IRN String: " + ((value != 0) ? toString(value) : "Zero")+
				"\tInt Value: " + Integer.toString(value));
	}
	public static String toString(int input)
	{
		String result = "";
		int in = input;
		
		while (in >= M)
		{
			in -= M;
			result += 'M';
		}
		
		while (in >= D)
		{
			in -= D;
			result += 'D';
		}
		
		while (in >= C)
		{
			in -= C;
			result += 'C';
		}
		
		while (in >= L)
		{
			in -= L;
			result += 'L';
		}
		
		while (in >= X)
		{
			in -= X;
			result += 'X';
		}
		
		while (in >= V)
		{
			in -= V;
			result += 'V';
		}
		
		while (in >= I)
		{
			in -= I;
			result += 'I';
		}
		
	return result;
	}
	
	public RomanNumeral add(RomanNumeral other)
	{
		return new RomanNumeral(this.value + other.toInt());
	}
	
	public RomanNumeral subtract(RomanNumeral other)
	{
		return new RomanNumeral(this.value - other.toInt());
	}
	
	public RomanNumeral multiply(RomanNumeral other)
	{
		return new RomanNumeral(this.value * other.toInt());
	}
	
	public RomanNumeral divide(RomanNumeral other)
	{
		return new RomanNumeral(this.value / other.toInt());
	}

}
