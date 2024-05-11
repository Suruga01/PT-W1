//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		System.out.println("Week 01 Lab \n");

		// 1. Create a variable to hold the quantity of available plane seats left on a flight	
		int SeatsAvailablesPlane = 10;
	
		// 2. Create a variable to hold the cost of groceries at checkout
		double GroceriesCost = 12.54;

		// 3. Create a variable to hold a person's middle initial
		char MiddleInitial = 'F';
	
		// 4. Create a variable to hold true if it's hot outside and false if it's cold outside
		boolean ItsHotOutside = true;
		
		// 5. Create a variable to hold a customer's first name
		String FirstName = "Alejandro";
		
		// 6. Create a variable to hold a street address
		String StreetAddress = "874 Creighton Dr";
		
		// 7. Print all variables to the console
		System.out.println("Availables seats left on the plane: " + SeatsAvailablesPlane);
		System.out.println(GroceriesCost + " Is the price of the groceries");
		System.out.println("Middle name initial: " + MiddleInitial);
		System.out.println("It's hot out side: " + ItsHotOutside);
		System.out.println("Firts name: " + FirstName);
		System.out.println("Strret Address: " + StreetAddress);
		
		System.out.println("\n --------------------------------------------------------- \n");
		
		// 8. A customer booked 2 plane seats, remove 2 seats from the available seats variable
		SeatsAvailablesPlane = SeatsAvailablesPlane - 2;
		// SeatsAvailablesPlane -= 2; //same
		System.out.println("Availables seats left on the plane: " + SeatsAvailablesPlane);

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total costOfGroceries = costOfGroceries + 2.15;
		GroceriesCost = GroceriesCost  + 2.15;
		// GroceriesCost += 2.15;
		System.out.println(GroceriesCost + " Is the price of the groceries");

		// 10.  The birth certificate was printed incorrectly, change the middle initial to something else
		MiddleInitial = 'J';
		System.out.println("Middle name initial: " + MiddleInitial);
		
		// 11.  The season has changed, update the hot outside variable to be opposite of what it was
		ItsHotOutside = false;
		// ItsHotOutside = !ItsHotOutside;
		System.out.println("It's hot out side: " + ItsHotOutside);
		
		// 12.  Create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
		String LastName = "Arriera";
		String FullName = FirstName + " " + MiddleInitial + " " + LastName;
		System.out.println("User full name is: " + FullName);
		
		// 13.  Print a line to the console that introduces the customer and says they live at the address variable
		System.out.println("Hi my name is " + FullName + " and i live at " + StreetAddress + ".");
		
	}
}