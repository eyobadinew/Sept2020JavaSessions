package AccessModifier2;

import AccessModifier1.Father;

public class Stranger {

	public static void main(String[] args) {
		// Stranger s = new Stranger();
		// System.out.println(s.name);  impossible different class
Father f =  new Father();
System.out.println(f.name);
//  only public class is accessible for different package and non sub class
	}

}
