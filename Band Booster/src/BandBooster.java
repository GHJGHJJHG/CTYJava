//Lesson 4 - Programming assignment

import java.text.DecimalFormat;
public class BandBooster {
	
	//Constants
	private static final double T1PRICE = 2.25;
	private static final double T2PRICE = 3.00;
	
	//Instance variables
	private String name;
	private int t1Sold;
	private int t2Sold;
	
	
	public BandBooster(String n)
	{
		name = n;
		t1Sold = 0;
		t2Sold = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void updateBarsSold(int t1, int t2)
	{
		t1Sold += t1;
		t2Sold += t2;
	}
	
	public double moneyEarned()
	{
		return (t1Sold*T1PRICE)+(t2Sold*T2PRICE);
	}
	
	public String toString()
	{
		DecimalFormat money = new DecimalFormat("$###.00");
		
		return String.format("Name: %s\t\tType 1 sold: %d\tType2 Sold: %d\t\tTotal Collected: %s", name, t1Sold, t2Sold, money.format(t1Sold*T1PRICE)+(t2Sold*T2PRICE));
	}
	
}
