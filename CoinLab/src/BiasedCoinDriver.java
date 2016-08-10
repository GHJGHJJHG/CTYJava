
public class BiasedCoinDriver {

	public static void main(String[] args) {
		BiasedCoin unfairCoin = new BiasedCoin(.9);
		int totalHeads = 0;
		int flips = 1000;
		
		for(int i = 0; i < flips; i++)
		{
			unfairCoin.flip();
			if (unfairCoin.isHeads()) totalHeads++;
		}
		
		System.out.println(totalHeads + " heads of " + flips);
		System.out.println((double)totalHeads/flips);
		
		
		
	}

}
