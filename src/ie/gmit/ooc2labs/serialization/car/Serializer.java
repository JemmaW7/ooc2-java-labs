//Java code for serialization of a Car object 
package ie.gmit.ooc2labs.serialization.car;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serializer {
	public static void main(String[] args) {

		Car CarObject1 = null; // Car Object to serialize
		
		//Car CarObject2 = null; // Car Object to serialize
		//List<Car> cars = null;
		
		// Object Streams out and into storage file
		FileOutputStream fileOutStream = null;
		ObjectOutputStream objectOutStream = null;
		// Create a String to hold the object storage file name
		String objectStorageFileName = ".\\resources\\objectStorageFile.ser";

		// Create a Car object to be serialized
		CarObject1 = new Car("ford", 1);
		
		//CarObject2 = new Car("Nissan", 2);
		//cars = new ArrayList<Car>();
		//cars.add(CarObject1);
		//cars.add(CarObject2);
		
		try {
			// Set up object stream to file
			fileOutStream = new FileOutputStream(objectStorageFileName);
			objectOutStream = new ObjectOutputStream(fileOutStream);
			// Serialize Car object and stream to file for storage
			objectOutStream.writeObject(CarObject1);
			
			//objectOutStream.writeObject(cars);
			
			System.out.println("The Car object/s have been serialized!");
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
