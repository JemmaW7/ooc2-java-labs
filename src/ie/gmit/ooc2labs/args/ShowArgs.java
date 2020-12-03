package ie.gmit.ooc2labs.args;

public class ShowArgs {
	
	public static void main(String[] args) {
		
		// Passing the integer 5 as an argument to this method.
		add10(5, 6); 
				
	} // End main

	// add method with one input parameter, an integer named x.
	static void add10(int x, int y) {
		
		System.out.println(x + y +  10);
	
	} // End add
	
} // End class
