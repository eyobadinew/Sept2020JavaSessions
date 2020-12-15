package AccessModifier2;

import AccessModifier1.Father;

public class Child2 extends Father {

	public static void main(String[] args) {
		
		Child2 c2 = new Child2();
		System.out.println(c2.name);
		System.out.println(c2.salary);
		// only public and protected classes are called in different package sub class call
		
		
		

	}

}
