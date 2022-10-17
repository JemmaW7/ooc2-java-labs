package ie.atu.exceptionhandling;

public class ArithmeticEx {

	public static void main(String[] args) {
		//code that raises exception
		int result = 0;
		
		try {
			result = 100/5;
		} catch (ArithmeticException artEx) {
			// TODO: handle exception
			System.out.println(artEx);
			System.out.println("You caused an arithmetic exception!");
		
		}
		
		System.out.println("I will not get executed!");
		System.out.println(result);
		
	}
	
}
