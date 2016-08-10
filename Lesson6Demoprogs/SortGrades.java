//********************************************************************
//  SortGrades.java       Author: Lewis/Loftus/Cocking
//
//  Driver for testing a numeric selection sort.
//********************************************************************

public class SortGrades
{
   //-----------------------------------------------------------------
   //  Creates an array of grades, sorts them, then prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int[] grades = {77, 94, 69, 80, 77, 85, 73, 91, 77, 85, 93};

      Sorts.selectionSort (grades);System.out.println("Using Selection Sort");
// 		  Sorts.insertionSort (grades);System.out.println("Using Insertion Sort");
		  
		  
      for (int index = 0; index < grades.length; index++)
         System.out.print (grades[index] + "   ");
      System.out.println();
   }
}
