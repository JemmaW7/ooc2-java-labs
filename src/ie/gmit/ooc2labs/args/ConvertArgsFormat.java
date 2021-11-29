package ie.gmit.ooc2labs.args;

class ConvertArgsFormat {
	public static void main(String args[]) {
		// Create three integers
		int a = 0; // To store command line argument 1
		int b = 0; // To store command line argument 2
		int result = 0; // Int to hold the result of a + b

		// Check if two or more command line arguments were entered
//		if (args.length >= 2) {
			
			System.out.println("1st argument:\t" + args[0]);
			System.out.println("2nd argument:\t" + args[1]);

			// Check if command line arguments can be converted to integers
//			try {
				// Convert the first two command line arguments to integers and store
				a = Integer.parseInt(args[0]);
				b = Integer.parseInt(args[1]);
				// Sum the stored command line arguments
				result = a + b;
				// Print the result of a + b to the console
				System.out.println(a + " + " + b + " = " + result);			
//			} catch (NumberFormatException e) {
//				System.out.println("You did not enter integers!");
//				System.out.println("Please try again. Enter 2 integers as command line arguments.\n");
//			} // End try/catch	
				
//		} else {
				
//			System.out.println("Please try again. Enter 2 integers as command line arguments.");
				
//		} // End if
		
	} // End main
}// End class
