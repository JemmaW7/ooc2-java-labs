package ie.gmit.ooc2labs.serialization.car;

public class Car implements java.io.Serializable{
	
	private static final long serialVersionUID = -644012276880766677L;
	public transient String owner;
	public String make;
	public int age; 
	 
	// Constructor 
	public Car(String make, int age) 
	{ 
		this.make = make; 
		this.age = age; 
	}
	
	// Constructor 
	public Car(String make, int age, String owner) 
	{ 
		this.make = make; 
		this.age = age;
		this.owner = owner;
	} 
}
