package ie.gmit.ooc2labs.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOExe {

	public static void main(String args[]) {
		// The program doesn’t compile, because the function main() uses FileReader().
		// FileReader() throws a checked exception FileNotFoundException.
		try {
			FileReader file = new FileReader("C:\\test\\a.txt");
		} catch (FileNotFoundException e) {
			// Print Fault
			e.printStackTrace();
		}

		System.out.println("Program ending gracefully...");

	} // End main
} // End Class
