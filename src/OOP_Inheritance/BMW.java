package OOP_Inheritance;

public class BMW extends Car{
     
   @Override// doesn't produce error here cause it is override but paste this @Override in autoparking ...error comes
	public void start() {
		System.out.println("BMW----Start");
	}
 
	public void autoParking() {
		System.out.println("BMW auto parking");
	}
	// copy pasted static method from car class...but cannot be override check by writing @Override..error 
	// @Override
	public static void wheels() {
		System.out.println("Car wheels");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW ------engine");
	}
}
