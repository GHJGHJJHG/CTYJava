// for each loop - demo2
//
// shows use of for each loop for stepping 
// thru an array of objects (strings in this example)
public class ForEachDemo2
{
	public static void main(String [] args)
	{
		String [] sray = {"HELLO", "GOODBYE", "SEEYOUSOON" };
		
		// for each loop: read as for each String s in the array sray ...
		// NOTE: s is NOT an index here in effect s = EACH element in 
		//       the array one at a time 		
		for (String s : sray)
		{
			System.out.println(s);
			s = "KEVIN";
			System.out.println(s.substring(0,3));
		}	
		// Since s is a String any string methods can be used with it
		
		for(int i = 0; i < 3; i++)
			System.out.println(sray[i]);
	}
}