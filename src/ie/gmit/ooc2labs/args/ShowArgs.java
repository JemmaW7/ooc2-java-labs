package ie.gmit.ooc2labs.args;

public class ShowArgs {
	
	public static void main(String[] args) {
		
		// Passing the integers 5 and 6 as arguments to this method.
		add10(5, 6); 
				
	} // End main

	// add method with two input parameters, one integer named x and one named y.
	static void add10(int x, int y) {
		System.out.println("Argument 1: " + x);
		System.out.println("Argument 2: " + y);
		System.out.println("Argument 1 + Argument 2 = " + (x + y));
	
	} // End add method

} // End class
