package ExceptionHandling;

public class TryCatchPart2 {
 String name = "Tom";
 
	public static void main(String[] args) {
		
		TryCatchPart2 obj = new TryCatchPart2();
		obj = null;
		
		try {
		   int i = 9/0; // ArithmeticException
			System.out.println(obj.name);  // null pointer exception   ......good example...use try to solve the issue
		}
		//only one exception at a time
		catch(NullPointerException e) {
			System.out.println("Nullpointer exception....");
		}
		catch(ArithmeticException e) {
			System.out.println("Arith exception....");
		}
  // if u don't know the name of the exception ...use either (Exception e) or (Throwable e)
		// i.e catch(Exception e)  or catch(Throwable e)
	}

}
