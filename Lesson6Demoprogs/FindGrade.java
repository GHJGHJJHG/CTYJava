//********************************************************************
//  FindGrade.java       Author: Lewis/Loftus/Cocking
//
//  Driver for testing a numeric binary search.
//********************************************************************
import java.util.*;
import java.io.*;
public class FindGrade
{
   //-----------------------------------------------------------------
   //  Creates an array of grades, sorts them, then prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
  	   String fileName = "TestGrades.txt";
	   File dataFile = new File(fileName);
//      int[] grades = {60, 68, 70, 72, 73, 77, 85, 86, 89, 93, 95, 98};

	  // Demo to show reading from an external text file using Scanner
	  int[] grades = new int[43];


	  int i = 0;
	  try
	  {
	      Scanner inFile = new Scanner(dataFile);
	 
		  while (inFile.hasNextLine())
		  {
		  	grades[i] = inFile.nextInt();
		  	System.out.println("Found: " + grades[i]);
		  	i++;
		  }
		  inFile.close();
	  }
	  catch (FileNotFoundException e)
	  {
		  System.out.println(e);
	  }

	  for (i = 0; i < 14; i++)
		  System.out.print(grades[i] + "\t");
	  
/*

//	  Sy0stem.out.println(grades[5]);
//	  System.out.println(grades[37]);
// Search for the grade 77
      int lookFor = 77;
      int pos = Searches.binarySearch (grades, lookFor);

      if (pos != -1)
         System.out.println ("The grade " + lookFor + " was found at "
             + "position " + pos);
      else
         System.out.println ("The grade " + lookFor + " was not found");

      // Search for the grade 94
      lookFor = 94;
      pos = Searches.binarySearch (grades, lookFor);

      if (pos != -1)
         System.out.println ("The grade " + lookFor + " was found at "
             + "position " + pos);
      else
         System.out.println ("The grade " + lookFor + " was not found");

   
*/
   }
}
