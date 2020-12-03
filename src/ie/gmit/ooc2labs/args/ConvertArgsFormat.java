package ie.gmit.ooc2labs.args;

class ConvertArgsFormat {

	public static void main(String args[]) {
		// Create three integers
		int a = 0;
		int b = 0;
		int c = 0;

		// Check if two or more command line arguments were entered
		if (args.length >= 2) {
			
			System.out.println("1st argument:\t" + args[0]);
			System.out.println("2nd argument:\t" + args[1]);

			// Check if command line arguments can be converted to integers
			try {
				// Convert the first two command line arguments to integers and store
				a = Integer.parseInt(args[0]);
				b = Integer.parseInt(args[1]);
				// Sum the stored command line arguments
				c = a + b;
				// Print the result to the console
				System.out.println(a + " + " + b + " = " + c);
			} catch (NumberFormatException e) {
				System.out.println("Please enter integers for the first two command line arguments!\n");
				e.printStackTrace();
			} // End try/catch
			
		} else {
			System.out.println("Please enter 2 or more command line arguments.");
		} // End if
		
	} // End main method

}// End Main class
