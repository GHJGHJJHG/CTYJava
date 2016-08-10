
public class Fraction
{
	
	private int num;
	private int denum;
	
	public Fraction (int num, int denum)
	{
		if (denum == 0)
			throw new IllegalArgumentException("0 as a numerator will cause a division by zero error. ");
		
		this.num = num;
		this.denum = denum;
		reduce();
	}
	
	public int getNum() {return num;}
	public int getDenum() {return denum;}
	
	public Fraction add(Fraction other) //I know it doesn't make sense. I mean, this spec is so ridiculous. It SHOULD return void. 
	{
		return new Fraction (
				(other.num*this.denum) + (other.denum * this.num),
				other.denum * this.denum);
	}
	
	public String toString()
	{
		return num + " / " + denum;
	}
	
	public void reduce()
	{
		int gcf = GCF(num, denum);
		this.num /= gcf;
		this.denum /= gcf;
		
		if (denum < 0 && num > 0)
		{
			num *= -1;
			denum *= -1;
		}
	}
	
	public static int GCF(int p, int q)
	{
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
	}
	
	public Fraction subtract(Fraction other)
	{
		return new Fraction (
				(other.denum * this.num) - (other.num*this.denum),
				other.denum * this.denum);
		
	}
	
	public Fraction multiply(Fraction other)
	{
		return new Fraction(
				this.num*other.num,
				this.denum*other.denum);
	}
	
	public double toDecimal()
	{
		return (double)num/denum;
	}
	
	public boolean equals(Fraction other)
	{
		//Simplification is unnecessary if we can assume that they are already reduced from the constructor. 
		//other.reduce();
		//this.reduce();
		return ((other.num==this.num) && (other.denum == this.denum));
	}
	
}
