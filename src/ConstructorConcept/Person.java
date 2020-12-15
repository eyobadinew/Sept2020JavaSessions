package ConstructorConcept;

public class Person {
	String name;
	int age;
	int empid;
	double salary;
	boolean isPermanent;
	char gender;
	
	public Person() {
		System.out.println("0 parameter constructor");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	// to print this constructor info directly from eclipse...right click===source===generate constructor using field
	
	public Person(String name, int age, int empid, double salary, boolean isPermanent, char gender) {
	
		this.name = name;
		this.age = age;
		this.empid = empid;
		this.salary = salary;
		this.isPermanent = isPermanent;
		this.gender = gender;
	}

	//ordinary way of calling via object
	public static void main(String[] args) {
			
	/*	Person p = new Person();
		p.name = "Eyob";
		p.age = 37;
		p.empid = 50393;
		p.salary = 8000.00;
		
		System.out.println(p.name + " " + p.age+ " " + p.empid+ " " +p.salary);*/
	
		// call via constructors
		Person p1 = new Person("Eyob",37);
		System.out.println(p1.name+ " "+ p1.age);
		
	Person p2 = new Person("Hiwot", 34,8000.0);
	System.out.println(p2.name + " "+ p2.age+ " "+p2.salary);
	
	Person p3 = new Person("Henock", 38,500,7000.0,true,'M');
	System.out.println(p3.name+ " " +p3.age + " "+ p3.empid+ " "+ p3.salary+ " "+p3.isPermanent+ " "+p3.gender);
	System.out.println(p3.age);// to fetch only one param
	}
	

	
	
	
	
	
	
}
