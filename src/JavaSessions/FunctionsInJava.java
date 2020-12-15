package JavaSessions;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava a = new FunctionsInJava();
		a.test();
		a.printName();
		a.total();
		System.out.println(a.someReturnFunction());
		String s = a.getTrainerName();
		System.out.println("the trainer is :" +s);
		
		int w = a.getSum(80,30);
		System.out.println(w);
		int u = a.getSum(1000,3000);
		System.out.println(u);
		// generic function for addition created from line 14--17 
		String m = a.getCapitalName("Ethiopia");
		System.out.println(m);
		
		String n = a.getCapitalName("Russia");
		System.out.println(n);
		
		String o = a.getCapitalName("USA");
		System.out.println(o);
		
		int g = a.getMark("Edwin");
		System.out.println(g);
		
		int h = a.getMark("Tesfa");
		System.out.println(h);
		
		char d = a.getGender("Feleke");
		System.out.println(d);
		
		boolean j = a.getBrowserName("Chrome");
				System.out.println(j);
		boolean v = a.getBrowserName("IE");
				System.out.println(v);
	}
 // 1. No input and no return function
	public void test() {
		System.out.println("my first function");
	}
	public void printName() {
		System.out.println("EYOB");
	}
	public void total() {
		System.out.println("Print total:");
		int a = 10;
		int b = 25;
		int c = a + b;
		System.out.println(c);
	}
	//2. no input and some return function;
public int someReturnFunction() {
	System.out.println("Return it to me");
	int  x = 100;
	int y = 200;
	int z = x + y;
	return z;
}
    public String getTrainerName() {
    	String name = "Naveen";
        	return name;
    }
     //3. some input and some return;
    public int getSum(int a , int b) {
    	int sum = a + b;
    	return sum;
    }
     public String getCapitalName(String  countryName) {
    	 System.out.println("The capital city of : "  + countryName);
    	 
    	 if(countryName.equals("Ethiopia")) {
    		 return "AddisAbaba";
    	 }
    	 else if(countryName.equals("USA")) {
    		 return "DC";
    	 }
    	 else if(countryName.equals("India")) {
    		 return "New Delhi";
    	 }
    	 else {System.out.println("This country is not found");
    	 return "null";
    	 }
     }
     // When i give you student name pass me their respective mark
     public int getMark(String name) {
    	 int f = -1;
    	 System.out.println("The sudent name is : " +name);
    	 if(name.equals("Abebe")) {
    		 f = 99;
    	 }
    	 else if (name.equals("Kanul")) {
    		 f= 97;
    	 }
    	 else if (name.equals("Edwin")) {
    		 f = 95;
    	 }
    	 else {System.out.println("Student name not found :" +name );
     }
         return f;
     }

     // when i give you the person name return me his/her Gender;
     
     public char getGender(String name) {
    	char k = 'U';
    	System.out.println("The character for:" +name);
    	 if(name.equals("Feleke")) {
    		 k = 'M';
    	 }
    	 else if(name.equals("Felekech")) {
    		 k = 'F';
    	 }
    	 else {System.out.println("Unknown character");}
    	 return k;
     
     }
     
    // WAP check the browser and return the browser name with boolean.
     public boolean getBrowserName(String name) {
    	 boolean j = false;
    			 System.out.println("The browser is :" +name);
    	 if(name.equals("Chrome")) {
    		  j = true;
    	 }
    	 else if (name.equals("Safari")) {
    		 j = true;
    	 }
    
    	 else {System.out.println("unknown browser:" +name);}
    	 return j;
     }

}






