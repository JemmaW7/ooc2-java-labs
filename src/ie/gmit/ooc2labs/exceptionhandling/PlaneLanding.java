package ie.gmit.ooc2labs.exceptionhandling;

public class PlaneLanding {
	
	public static void main(String[] args) {

		try {

			System.out.println("Code running to land plane...");

			// Fault in code
			int i = 10 / 0;

		} catch (Exception ex) {
			
			System.err.println("Faulted detected and is being handled... don't panic nobody is going to die");
			ex.printStackTrace();

		} // End try/catch

		System.out.println("Plane finishes landing safely!");

	} // End main
	
} // End Class
