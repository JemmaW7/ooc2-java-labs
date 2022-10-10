package ie.atu.ooc2labs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;

public class CollectionsExample {

	public static void main(String[] args) {
		
		// Create a regular integer array
		int[] IntegerArray = new int [3];
		// Create an integer ArrayList
		ArrayList<Integer> IntegerArrayList = new ArrayList<>();
		// Create an integer LinkedList
		LinkedList<Integer> IntegerLinkedList = new LinkedList<>();
		
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
            	System.out.print(IntegerArray[i] + "]");
            }
        }
		
//		// Find minimum value in all arrays
//		while(it.hasNext()) {
//			String obj = (String) it.next();
//			System.out.println(obj);
//		}
//		
//		// Find the minimum value in the regular integer array
//		int max = IntegerArray[0];
//	    for (int i = 0; i < chars.length; i++) {
//	        if (IntegerArray[i] > max) {
//	            max = IntegerArray[i];
//	        }
//	    }
//	    
//		
//		System.out.println(Collections.min(IntegerArrayList));
//		System.out.println(Collections.min(IntegerLinkedList));
//		System.out.println(Collections.max(IntegerArrayList));
//		System.out.println(Collections.max(IntegerLinkedList));
//		
//		System.out.println(IntegerArray);
//		System.out.println(IntegerArrayList);
//		System.out.println(IntegerLinkedList);
		
	}
	
}
