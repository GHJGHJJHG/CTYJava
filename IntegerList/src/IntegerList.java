

public class IntegerList {

	private int [] intList;
	
	public IntegerList(int size) {
		
		intList = new int[size];
	}
	
	public void randomize() {
		for (int i = 0; i < intList.length; i++)
			intList[i] = (int)(Math.random()*100) + 1;
	}
	
	public void sortDecreasing() {
		
		Sorts.selectionSort(intList);


//		Arrays.sort(intList);
	}
	
	public int search(int key) { 
		for (int i = 0; i < intList.length; i++) {
	           if ( intList[i] == key ) 
	        	   return i;
	           }
		return -1;
	}
	
	//Sends list of integers, right to left, to output, with 10 integers per line.
	public void print() {
		
		for (int i = 0; i < intList.length; i++)
		{
			System.out.print(intList[i] + "\t");
			if (i%10 == 9)
				System.out.println();
		}
		
	}
	
	//Sorts in descending order. 
	public void selectionSort() {
		sortDecreasing();
		
		int[] reverse = new int[intList.length];
		for (int i = 0; i < intList.length; i++)
			reverse[intList.length-(i+1)] = intList[i];
		
		intList = reverse;
	}
	
	public void replaceAll(int key, int replacement) {
		
		for (int i = 0; i < intList.length; i++)
			if (intList[i] == key) intList[i] = replacement;
		
	}
	
	public void replaceFirst(int key, int replacement) {
		for (int i = 0; i < intList.length; i++)
			if (intList[i] == key) {
				intList[i] = replacement;
				break;
			}
		
	}
}
