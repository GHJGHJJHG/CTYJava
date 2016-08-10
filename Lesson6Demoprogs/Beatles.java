//********************************************************************
//  Beatles.java       
//
//  Demonstrates the use of a ArrayList object.
//********************************************************************

import java.util.ArrayList;
public class Beatles
{
   //-----------------------------------------------------------------
   //  Stores and modifies a list of band members.
   //  NOTE: check out ArrayList in Javadocs
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      ArrayList<String> band = new ArrayList<String>();

      band.add ("John");
      band.add ("Paul");
      band.add ("George");
      band.add ("Ringo");

      System.out.println (band);			// Notice how toString for ArrayLists works

      int location = band.indexOf ("George");	// example of indexOf with ArrayList
      band.remove (location);					// remove element "George"

      System.out.println (band);  
      System.out.println ("\nAt index 1: " + band.get(1));

	  band.add(0,"George");
	  band.add(3,"Mr. G");
      System.out.println (band);
      System.out.println ("\nSize of the band: " + band.size());  
      
      band.add(band.remove(2));
      System.out.println (band);
      
      System.out.println("\nList of all elements: " );
      // demo for each loop with ArrayList
      for (String n : band)
      {
      	System.out.println(n);
      }
   
      
   }
}







