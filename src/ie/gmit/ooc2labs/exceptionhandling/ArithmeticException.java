package ie.gmit.ooc2labs.exceptionhandling;

public class ArithmeticException {
	
	public static void main(String args[]) {
		
		try {
			// Code that may raise exception
			int data = 100 / 0;
			// After exception is thrown the rest of the try block does not get executed
			System.out.println("I will not get executed!");
			System.out.println(data);
		} catch (ArithmeticException exception) {
			System.out.println(exception);
			System.out.println(exception.getStackTrace()[0]);
			// Use printStackTrace() method to print both
//			exception.printStackTrace();  // This will give line number
		}
		
		// Rest of code in the program
		System.out.println("\n\n\nProgram continues running rest of the code...");
		
	} // End main
	
} // End class
