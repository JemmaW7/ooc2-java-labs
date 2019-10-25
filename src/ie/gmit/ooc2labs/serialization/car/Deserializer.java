//Java code for deserialization of a Car object 
package ie.gmit.ooc2labs.serialization.car;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializer {
	public static void main(String[] args) {

		Car deserializedCarObject = null; // Car Object to store deserialized Car Object

		// Object Streams out of storage file
		FileInputStream fileInStream = null;
		ObjectInputStream objectInStream = null;

		// Create a String to hold the object storage file name
		String objectStorageFileName = ".\\resources\\objectStorageFile.ser";

		try {
			// Create output object stream from file
			fileInStream = new FileInputStream(objectStorageFileName);
			objectInStream = new ObjectInputStream(fileInStream);
			// Deserialization of object and storage to empty Car object
			deserializedCarObject = (Car) objectInStream.readObject();

			System.out.println("Car object has been deserialized from " + objectStorageFileName);
			System.out.println("Deserialized Car Make = " + deserializedCarObject.make);
			System.out.println("Deserialized Car Age = " + deserializedCarObject.age);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close input streams
				objectInStream.close();
				fileInStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
