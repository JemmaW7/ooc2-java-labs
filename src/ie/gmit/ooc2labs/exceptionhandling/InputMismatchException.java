package ie.gmit.ooc2labs.exceptionhandling;

import java.util.Scanner;
import java.util.InputMismatchException;
//import java.lang.ArithmeticException;

public class DivideByZero {

	public static void main(String args[]) {
		// Instance Variables
		Scanner userInput = null;
		int numerator = 0;
		int denominator = 0;
		int result = 0; // Needs to be int to generate ArithmeticException

			try {
				userInput = new Scanner(System.in); // Create scanner object
				// Get numerator
				System.out.print("Please enter an integer numerator: ");
				numerator = userInput.nextInt();
				// Get denominator
				System.out.print("Please enter an integer denominator: ");
				denominator = userInput.nextInt();
				result = numerator / denominator;
				// Print Result
				System.out.println("\nResult: " + result);
			} catch (InputMismatchException inputMisEx) {
				System.out.println("\nYou did not enter an integer!");
				System.out.print("Exception: " + inputMisEx);
				System.out.println("\nPlease try again!\n");
			} catch (ArithmeticException ae) {
				System.out.print("\nThere was an Arithmetic Error: ");
				System.out.print("Exception: " + ae);
				System.out.println("\nPlease check your input numbers and try again!\n");
			} finally {
				userInput.close(); // Close Scanner object
			}
		
		System.out.println("Program continues on...");
		System.out.println("Program ending gracefully...");

	} // end main
} // end Class
