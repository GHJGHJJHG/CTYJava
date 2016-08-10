// ***************************************************************
//   Salary.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ***************************************************************
import java.text.*;

import java.util.*;
public class Salary
{
   public static void main(String[] args)
   { 
	   // fmt will format output to look like currency
	   NumberFormat fmt = NumberFormat.getCurrencyInstance();
	   
	   // keyboard is Scanner object for getting keyboard input
	   Scanner keyboard = new Scanner(System.in);
       
       double currentSalary;  		// employee's current  salary
       double raise = 0.0;          	// amount of the raise
       double newSalary;      		// new salary for the employee
       String rating;         		// performance rating

       System.out.print ("Enter the current salary: ");
       currentSalary = keyboard.nextDouble();

       	// eat the new line/carriage return = must do this everytime a nextLine()
	//                                    follows a nextInt() or nextDouble()
       keyboard.nextLine();

       System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
       rating = keyboard.nextLine();

       // Compute the raise using if ...  Your code goes here
       
       if (rating.equals("Excellent"))
       	   raise = currentSalary*.06;
       else if (rating.equals("Good"))
    	   raise = currentSalary*.04;
       else if (rating.equals("Poor"))
    	   raise = currentSalary*.015;


       newSalary = currentSalary + raise;

       // Print the results
       System.out.println();
       System.out.println("Current Salary       : "+fmt.format(currentSalary));
       System.out.println("Amount of your raise : "+fmt.format(raise));
       System.out.println("Your new salary      : "+fmt.format(newSalary));
       System.out.println();
    }
}
