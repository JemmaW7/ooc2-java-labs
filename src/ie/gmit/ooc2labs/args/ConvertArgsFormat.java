package ie.gmit.ooc2labs.args;

class ConvertArgsFormat {
	
	public static void main(String args[]) {
		int a, b, c;
		
		// Convert the first two command line arguments to integers and store
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		
		// Sum the stored command line arguments
		c = a + b; 
		
		// Print the result to the console
		System.out.println("The sum of " + a + " and " + b + " is: " + c);
	} // End main method
	
}// End Main class
