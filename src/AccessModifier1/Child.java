package AccessModifier1;

public class Child extends Father {

	public static void main(String[] args) {
		
		Child c = new Child();
	  System.out.println(c.name);
	//  System.out.println(c.age);       private variable inaccessible in another sub class same package
 System.out.println(c.salary);
 System.out.println(c.gender);
		
		
		//	System.out.println(u.name);     impossibel as they r from diffrent class

	}

}
