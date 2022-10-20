package ie.atu.exceptionhandling;

import java.util.Scanner;

public class InMis {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int numerator = 0;
		int denominator = 0;
		float result = 0;
		
		System.out.println("Please enter an integer numerator: ");
		try {
			// get numerator
			numerator = userInput.nextInt();
			// get denominator
			System.out.println("Please enter an integer denominator: ");
			denominator = userInput.nextInt();	
			
		} catch (InputMismatchException ime) {
			// TODO: handle exception
			System.out.println(ime);
			System.out.println("Please enter an integer!");
			userInput.nextLine();
			numerator = userInput.nextInt();
		}
		System.out.println("Please enter an integer denominators: ");
		
		try {
			//get denominator
			denominator = userInput.nextInt();
		} catch (InputMismatchException ime) {
			// TODO: handle exception
			System.out.println(ime);
			System.out.println("Please enter an integer!");
			userInput.nextLine();
			denominator = userInput
		}
		
	}
	
	
	

}
