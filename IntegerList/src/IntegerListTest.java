// ****************************************************************
// IntegerListTest.java
//
// Provide a menu-driven tester for the IntegerList class.
//          
// ****************************************************************
import java.util.*;
public class IntegerListTest
{

    //-------------------------------------------------------
    // Create a list, then repeatedly print the menu and do what the
    // user asks until they quit
    //-------------------------------------------------------
    public static void main(String[] args)
    {
       Scanner keyboard = new Scanner(System.in);
       IntegerList list = new IntegerList(10);		// default size is 10
       int loc, oldVal, newVal;

		while (true)
	    {
			printMenu();
			int choice = keyboard.nextInt();
			if (choice == 0) break;

			switch(choice)
		    {
		    	case 0: System.out.println("Bye!");
						break;
		    	
		    	case 1:	System.out.print("How big should the list be? ");
						int size = keyboard.nextInt();
						list = new IntegerList(size);
						list.randomize();
						list.print();
						break;


		    	case 2:	list.selectionSort();
		    			list.print();
						break;
		    	
		    	case 3:	System.out.print("Enter the value to look for: ");
						loc = list.search(keyboard.nextInt());
						if (loc != -1)
			    			System.out.println("Found at index position: " + loc);
						else
			    			System.out.println("Not in list");
						list.print();
						break;
		    	
		    	case 4:	list.print();
						break;
				
		    	case 5: list.sortDecreasing();
		    			list.print();
						break;
				
		    	case 6: System.out.print("Value to replace : ");
					    oldVal = keyboard.nextInt();
						System.out.print("Replace with what: "); 
						newVal = keyboard.nextInt();
						list.replaceFirst(oldVal,newVal);
						list.print();
						break;					
				
		    	case 7: System.out.print("Value to replace : ");
					    oldVal = keyboard.nextInt();
						System.out.print("Replace with what: "); 
						newVal = keyboard.nextInt();
						list.replaceAll(oldVal,newVal);
						list.print();
						break;					

		    	default:
						System.out.println("Sorry, invalid choice");
		    }
	    }
    }


    //-------------------------------------------------------
    // Print the user's choices
    //-------------------------------------------------------
    public static void printMenu()
    {
		System.out.println("\n   Menu   ");
		System.out.println("   ====");
		System.out.println("0: Quit");
		System.out.println("1: Create a new list (** do this first!! **)");
		System.out.println("2: Sort the list using selection sort");
		System.out.println("3: Find an element in the list using sequential search");
		System.out.println("4: Print the list");
		System.out.println("5. Sort the list in descending order");
		System.out.println("6. Replace a single item");
		System.out.println("7. Replace ALL occurences of an item");
		System.out.print("\nEnter your choice: ");
    }

}
