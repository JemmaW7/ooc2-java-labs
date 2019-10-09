package ie.gmit.ooc2labs.io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class averageCalculator {

	public static void main(String args[]) throws IOException {

		// try {

		File f = new File(".\\resources\\results.txt");
		Scanner s = new Scanner(f);

		int numIntsInFile = 0;
		int total = 0;

//			while (s.hasNextInt()) {
//				intCounter++;
//				total += s.nextInt();
//			}
//
//			System.out.println("Total results in file: " + intCounter);
//			System.out.println("Average of all results: " + (double) total / intCounter);

		// Find how many integers are in the file
		while (s.hasNextInt()) {
			numIntsInFile++;
			s.nextInt();
		}

		// Create an array to hold the ints
		int[] intArray = new int[numIntsInFile];

		// ArrayList<Integer> arrList = new ArrayList<Integer>();

		// Create a new scanner to navigate file
		Scanner s2 = new Scanner(f);
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = s2.nextInt();
			total += intArray[i];
			// arrList.add(intArray[i]);
		}

		System.out.println("Total results in file: " + intArray.length);
		System.out.println("All Results: " + Arrays.toString(intArray));
		System.out.println("Average of all results: " + (double) total / intArray.length);
		// System.out.println("Average of all results: " + (double) total /
		// arrList.size());

		s.close();
		s2.close();

		// } catch (Exception e) {
		// return null;
		// }
	}
}
