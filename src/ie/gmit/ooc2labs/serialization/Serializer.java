//Java code for serialization of a Car object 
package ie.gmit.ooc2labs.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializer {
	public static void main(String[] args) {

		Car CarObject1 = null; // Car Object to serialize
		// Object Streams out and into storage file
		FileOutputStream fileOutStream = null;
		ObjectOutputStream objectOutStream = null;
		// Create a String to hold the object storage file name
		String objectStorageFileName = ".\\resources\\objectStorageFile.ser";

		// Create a Car object to be serialized
		CarObject1 = new Car("ford", 5);

		try {
			// Set up object stream to file
			fileOutStream = new FileOutputStream(objectStorageFileName);
			objectOutStream = new ObjectOutputStream(fileOutStream);
			// Serialize Car object and stream to file for storage
			objectOutStream.writeObject(CarObject1);
			System.out.println("The Car object has been serialized!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Close output streams
			try {
				objectOutStream.close();
				fileOutStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
