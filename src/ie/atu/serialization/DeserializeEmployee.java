package ie.atu.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializeEmployee implements Serializable {

	private static final long serialVersionUID = 200L;

	public static void main(String[] args) {
		Employee employeeObject2 = null;
		File inputByteFile = new File(".\\resources\\employeeByteFile.ser");
		FileInputStream inputByteFileStream = null;
		ObjectInputStream inputByteFileStreamForObjects = null;

		// Deserialization
		try {
			// Saving of object to a file
			inputByteFileStream = new FileInputStream(inputByteFile);
			inputByteFileStreamForObjects = new ObjectInputStream(inputByteFileStream);

			// Method for serialization of object
			employeeObject2 = (Employee) inputByteFileStreamForObjects.readObject();

			inputByteFileStreamForObjects.close();
			inputByteFileStream.close();

			System.out.println("Object has been deserialized");
			System.out.println(employeeObject2.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // End try/catch

	} // End main

} // End Class
