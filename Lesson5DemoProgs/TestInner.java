//********************************************************************
//  TestInner.java       Author: Lewis/Loftus
//
//  Demonstrates the access capabilities of inner classes.
//********************************************************************

public class TestInner
{
   //-----------------------------------------------------------------
   //  Creates and manipulates an Outer object.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Outer out = new Outer();

      System.out.println (out);
      System.out.println();

      out.changeMessages();

      System.out.println (out);
   }
}
