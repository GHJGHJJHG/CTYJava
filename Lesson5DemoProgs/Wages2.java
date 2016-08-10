//********************************************************************
//  Wages2.java       Author: G. Gonsalves
//
//  Demonstrates the use of Scanner for keyboard input.
//  Demonstrates the use of NumberFormat class for formatted output
//********************************************************************

import java.util.*;
import java.text.NumberFormat;

public class Wages2
{
   //-----------------------------------------------------------------
   //  Reads pertinent information and calculates wages.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
	  Scanner input = new Scanner(System.in);

      String name;
      int hours;
      double rate, pay;

      System.out.print ("Enter your name: ");
      name = input.nextLine ();

      System.out.print ("Enter the number of hours worked: ");
      hours = input.nextInt();

      System.out.print ("Enter pay rate per hour: ");
      rate = input.nextDouble();

      System.out.println ();

      pay = hours * rate;

      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      System.out.println (name + ", your pay is: " + fmt.format(pay));
   }
}
