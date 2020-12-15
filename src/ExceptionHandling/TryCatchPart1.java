package ExceptionHandling;

public class TryCatchPart1 {

	public static void main(String[] args) {
		System.out.println("Hi");
		System.out.println("Hi");
		
		try {
		int i = 9/0;}
		catch(ArithmeticException e) {
			System.out.println("some exception");
			e.printStackTrace();
		}
		
		System.out.println("Hi");

	}

}
