package ie.gmit.ooc2labs.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Averager {
	public static void main(String[] args) throws FileNotFoundException {

		// Instance variables
		File file = new File(".\\resources\\results.txt");
		Scanner scannerObject = new Scanner(file);
		int counter = 0;
		int total = 0;

		System.out.print("Inputted ints: [");
		// Loop over ints in file
		while (scannerObject.hasNextInt()) {
			int nextInt = scannerObject.nextInt();

			if (scannerObject.hasNextInt()) {
				System.out.print(nextInt + ", ");
			} else {
				System.out.print(nextInt);
			}

			counter++; // Count total ints in file
			total += nextInt; // File total of all ints
		}
		System.out.print("]\n");

		System.out.println("Total results in file: " + counter);
		System.out.println("Average of all results: " + (double) total / counter);

		scannerObject.close();

	}
}
