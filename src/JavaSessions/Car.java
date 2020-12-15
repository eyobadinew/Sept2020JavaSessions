package JavaSessions;

public class Car {
  String name;
  char y;
  String model;
  int price;
  
	
	public static void main(String[] args) {
		
	Car a = new Car();
	a.name= "Toyota";
	a.y= 'y';
	a.model= "yaris";
	a.price= 500000;
	System.out.println(a.name + " " +a.y + " " + a.model + " " +a.price);
	
	Car b = new Car();
	b.name = "Nissan";
	b.y= 'y';
	b.model= "Altima";
	b.price= 800000;
	
	System.out.println(b.name + " "+ b.y + " "+ b.model + " "+ b.price);
	
	Car c = new Car();
	c.name= "Toyota";
	c.y= 'n';
	c.model= "Vitz";
	c.price= 400000;
	System.out.println(c.name + " " + c.y + " "+ c.model + " "+ c.price );
	
	// no reference object
	new Car().name = "corola";
	new Car().y = 'y';
	new Car().model = "2003";
	new Car().price = 700000;
	
	System.out.println(new Car().name);
		
	a = b;
	b= c;
	System.out.println(a.name + " " +a.y + " " + a.model + " " +a.price);
	System.out.println(b.name + " "+ b.y + " "+ b.model + " "+ b.price);
	System.out.println(c.name + " " + c.y + " "+ c.model + " "+ c.price );
	
	c = a;
	/* Nissan y altima 800000
	 * Toyota n vitz 400000
	 * Toyota n vitz 400000
	 */
	}

}
