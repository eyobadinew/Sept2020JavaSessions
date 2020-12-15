package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {
		
	// String to integer conversion (Wrapper Integer. class)

		String s = "600";
		System.out.println(s+100);// 600100 concatenation
		int i =  Integer.parseInt(s);
		System.out.println(i+100); // 700
		
		// String to Double conversion (Wrapper Double. class)
		String r = "24.44";
		System.out.println(r+10); // 24.4410
		Double d = Double.parseDouble(r);
		System.out.println(d+10); // 34.44
		
		// Double and Integer in the above case are wrapper classes that comes on top of primitive integer or double
	
	/* Number format exception
		String h = "200A";
		int a = Integer.parseInt(h);   // Number format exception
		System.out.println(a+20); */
	
		// Integer to String Conversion  .... String is not a wrapper class...
		int k = 200;
		System.out.println(k+20); //220
		String j = String.valueOf(k);
		System.out.println(j+20);  // 20020
		 
		
	}

}
