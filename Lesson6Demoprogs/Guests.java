//********************************************************************
//  Guests.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates a linear search.
//********************************************************************
import java.util.*;
public class Guests
{
   //-----------------------------------------------------------------
   //  Creates an array of guests' names and allows the user to
   //  search the array for a particular name.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      String[] guests = {"Paul", "Wendy", "Jared", "Eric", "Ayame",
                         "Ian", "Isobel", "Hakem"};
      String name;
      Scanner keyboard = new Scanner(System.in);
      boolean found = false;
      System.out.print ("Enter a name: ");
      name = keyboard.nextLine();

      // Perform a linear search
      for (int index = 0; index < guests.length; index++)
         if (name.equals(guests[index]))
            found = true;

      if (found)
         System.out.println (name + " is on the guest list.");
      else
         System.out.println (name + " is not on the guest list.");
   }
}
