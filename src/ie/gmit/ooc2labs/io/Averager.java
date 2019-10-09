package ie.gmit.ooc2labs.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Averager {
	public static void main(String[] args) {

		// Instance variables
		File file = new File(".\\resources\\results.txt");
		try {
			Scanner scannerObject = new Scanner(file);

			int total = 0;
			// Create an array to hold the ints
			List<Integer> listOfInts = new ArrayList<Integer>();
			int nextInt;

			// Loop over ints in file
			while (scannerObject.hasNextInt()) {
				nextInt = scannerObject.nextInt();
				listOfInts.add(nextInt);
				total += nextInt;
			}

			System.out.println("Inputted ints:" + listOfInts.toString());
			System.out.println("Total results in file: " + listOfInts.size());
			System.out.println("Average of all results: " + (double) total / listOfInts.size());

			scannerObject.close();
		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		}

	}
}
