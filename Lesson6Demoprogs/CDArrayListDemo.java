//********************************************************************
//  CDArrayListDemo - demonstrates the use of array list on 
//									objects -in this case CD's
//
//  Demonstrates the use of a ArrayList object.
//********************************************************************

import java.util.ArrayList;

public class CDArrayListDemo
{
   //-----------------------------------------------------------------
   //  Stores and modifies 3 CD's
   //  NOTE: check out ArrayList in Javadocs
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      CD myCD1 = new CD("By the Way", "Red Hot Chili Peppers", 14.95, 10);
      CD myCD2 = new CD("Come On Over", "Shania Twain", 14.95, 16);
      CD myCD3 = new CD("Soundtrack", "The Producers", 17.95, 33);

      ArrayList<CD> CDList = new ArrayList<CD>();

      CDList.add (myCD1);
      CDList.add (myCD2);
      CDList.add (myCD3);

      System.out.println (CDList);  // prints out weird formatted ArrayList
      System.out.println("\n\n");

      int location = CDList.indexOf (myCD2);
      System.out.println(location);
      
      // You do NOT need to caste the object returned by the get method 
      // as long as the ArrayList is declared using an element type 
      CD anotherCD = CDList.get(1);
      System.out.println ("At index 1: " + anotherCD);

	  CDList.add(new CD("Rita's Gone", "Delbert McClinton", 15.95, 12));
      System.out.println ("At index 3: " + CDList.get(3));				// caste not necessary here

      anotherCD = CDList.get(3);
      anotherCD = CDList.set(0,anotherCD);
      System.out.println("\nanotherCD is now: " + anotherCD);
      System.out.println("\nThe CDList is now: \n" + CDList);


   }
}
