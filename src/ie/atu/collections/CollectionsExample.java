package ie.atu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionsExample {

	public static void main(String[] args) {

		// Create a regular integer array
		int[] IntegerArray = new int[3];
		// Create an integer ArrayList
		List<Integer> IntegerArrayList = new ArrayList<>();
		// Create an integer LinkedList
		List<Integer> IntegerLinkedList = new LinkedList<>();

		// Add 3 integers to all arrays
		IntegerArray[0] = 1;
		IntegerArray[1] = 2;
		IntegerArray[2] = 3;
		IntegerArrayList.add(1);
		IntegerArrayList.add(2);
		IntegerArrayList.add(3);
		IntegerLinkedList.add(1);
		IntegerLinkedList.add(2);
		IntegerLinkedList.add(3);

		// Print the contents of all arrays
		System.out.println(IntegerArray);
		System.out.println(IntegerArrayList);
		System.out.println(IntegerLinkedList);

		// Print regular array
		System.out.print("[");
		for (int i = 0; i < IntegerArray.length; i++) {
			if (IntegerArray[i] != IntegerArray.length) {
				System.out.print(IntegerArray[i] + ", ");
			} else {
				System.out.println(IntegerArray[i] + "]");
			}
		}

		// Find the minimum value in all arrays
		// Find the minimum value in the regular integer array
		int min = IntegerArray[0];
		for (int i = 1; i < IntegerArray.length; i++) {
			if (IntegerArray[i] < min) {
				min = IntegerArray[i];
			} // End if
		} // End for

		System.out.println(min);

		// Find minimum values of ArrayLists and LinkedLists
		System.out.println(Collections.min(IntegerArrayList));
		System.out.println(Collections.min(IntegerLinkedList));

		// Create a ListIterator for the IntegerArrayList
		ListIterator<Integer> listIteratorForIAL = (ListIterator<Integer>) IntegerArrayList.listIterator();

		// Use the ListIterator to iterate over the IntegerArrayList
		System.out.println("Loop through the IntegerArrayList in forward direction:");
		while (listIteratorForIAL.hasNext()) {
			System.out.println(listIteratorForIAL.next());
		}

		System.out.println("\nTraversing the IntegerArrayList in backward direction:");
		while (listIteratorForIAL.hasPrevious()) {
			System.out.println(listIteratorForIAL.previous());
		}

		// Use an ListIterator to loop through the IntegerLinkedList
		System.out.println("Remove 2 from the IntegerArrayList using the listIteratorObject...");
		System.out.println("Integer ArrayList before removal: " + IntegerArrayList);
		for (Integer IntegerArrayListElement : IntegerArrayList) {
			// Select element from the IntegerArrayList
			listIteratorForIAL.next();
			// Search for the required element to remove
			if (IntegerArrayListElement == 2) {
				// remove element from IntegerArrayList
				listIteratorForIAL.remove();
				// Print the new IntegerArrayList with the element removed
				System.out.println("Integer ArrayList after removal: " + IntegerArrayList);
				// Break out of the loop as there is no need to keep searching
				break;
			}
		}
		
	} // End main
} // End class
