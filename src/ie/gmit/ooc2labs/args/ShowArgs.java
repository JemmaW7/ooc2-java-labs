package ie.gmit.ooc2labs.args;

public class ShowArgs {
	public static void main(String[] args) {
		
		System.out.println("The following command line arguments were passed:");
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("arg[" + i + "]: " + args[i]);
		}
		
		add(5);
		
	} //End main
	
	static void add(int x) {
		System.out.println(x + " + 10 = " + 10);
	}
} //End class
