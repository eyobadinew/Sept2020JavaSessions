package OOP_Inheritance;

public class CarTest {

	public static void main(String[] args) {
		 BMW b = new BMW();
		 b.stop(); // Inherited from Car
		 b.refuel(); // Inherited from car
		 b.start(); // Overridden method...calls from BMW though available in both BMW and Car....this is called method overriding
		 b.autoParking(); // Independent method form car......calling a method from BMW class
		 
		 b.engine();  // children can inherit method from grand parents
		 
		 
		 //we can also create the object of Car class.
		 Car c = new Car();
		 c.start();
		 c.stop();
		 c.refuel();
		// c.autoParking();  //  impossible as child can't inherit form parent.
		 Car.wheels();// static method as we know will be called by Class name...Car.wheels();
		 c.engine(); // inheritance
	
		 
		 //Top Casting
		 Car c1 = new BMW();  // child object referred by parent class reference variable
	     c1.start();
	     c1.stop();
	     c1.refuel();
	  // c1.autoParking();   error reference type check won't allow as reference comes from car class..
	     
	     //Down casting
	 //    BMW b1 =(BMW)new Car();  class cast exception
	     
	 Vehicle v1 = new BMW();
	 v1.engine(); // possible... but
//	v1.start(); v1.stop(); /// etc are impossible 
	
	 
	 // now we can copy paste the engine method from engine to BMW grand child and override
	
	
	}

}
