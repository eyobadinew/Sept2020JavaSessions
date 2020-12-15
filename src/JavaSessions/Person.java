package JavaSessions;

public class Person {
  String name;
  int age;
  char gender;
  double height;
	public static void main(String[] args) {
		
		Person a = new Person();
		a.name = "Mariamawit";
		a.age = 2;
		a.gender = 'F';
		a.height= 1.15;
		
		System.out.println(a.name + " "+ a.age + " "+ a.gender + " "+ a.height);
		
		Person b = new Person();
		b.name = "Hiwot";
		b.age = 30;
		b.gender = 'F';
		b.height= 1.70;
		System.out.println(b.name + " "+ b.age + " " + b.gender + " "+ b.height);
		
		Person c = new Person();
		c.name= "Eyob";
		c.age = 37;
		c.gender= 'M';
		c.height= 1.76;
		System.out.println(c.name + " "+ c.age + " "+ c.gender+ " "+ c.height );
		
		a=c;
		b=a;
		System.out.println(a.name + " "+ a.age + " "+ a.gender + " "+ a.height);
		System.out.println(b.name + " "+ b.age + " " + b.gender + " "+ b.height);
		System.out.println(c.name + " "+ c.age + " "+ c.gender+ " "+ c.height );
		/*Eyob 37 M 1.76
		 * Eyob 37 M 1.76
		 * Eyob 37 M 1.76*/
		 
				
	}

}
