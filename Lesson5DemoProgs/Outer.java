//********************************************************************
//  Outer.java       Author: Lewis/Loftus
//
//  Represents a class that encapsulates an inner class.
//********************************************************************

public class Outer
{
   private int num;
   private Inner in1, in2;

   //-----------------------------------------------------------------
   //  Sets up this object, initializing one int and two objects
   //  created from the inner class.
   //-----------------------------------------------------------------
   public Outer()
   {
     num = 9876;
     in1 = new Inner ("Half of the problem is 90% mental.");
     in2 = new Inner ("Another deadline. Another miracle.");
   }

   //-----------------------------------------------------------------
   //  Changes the messages in the Inner objects (directly).
   //-----------------------------------------------------------------
   public void changeMessages()
   {
      in1.message = "Life is uncertain. Eat dessert first.";
      in2.message = "One seventh of your life is spent on Mondays.";
   }

   //-----------------------------------------------------------------
   //  Returns this object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      return in1 + "\n" + in2;
   }

   //*****************************************************************
   //  Represents an inner class. 
   //*****************************************************************
   private class Inner
   {
      public String message;

      //--------------------------------------------------------------
      //  Sets up this Inner object with the specified string.
      //--------------------------------------------------------------
      public Inner (String str)
      {
         message = str;
      }

      //--------------------------------------------------------------
      //  Returns this object as a string, including a value from
      //  the outer class.
      //--------------------------------------------------------------
      public String toString()
      {
         num++;
         return message + "\nOuter num = " + num;
      }
   }
}
