package JavaSessions;

public class FinallyConcept {

	public static void main(String[] args) {
	
		
		int h = getMark("chachi");
		System.out.println(h);  //  returns first bye bye... and then -3 not 95 
		//why cause finally code overrides all other codes whether
		                   // an exception comes or not
	
	// when int k = 9/0 exception inserted and return -3 commented out the output is bye bye(first execution) and -2
	
	}
	
	
 public static int getMark(String name) {
	
	try { 
	 if(name.equals("Job")) {
		 return 100;
	 }
	 else if(name.equals("chachi")) {
		// int k = 9/0;
		 return 95;
	 }
	 else {return -1;}
	}
	catch (Exception e) {
		return -2;
	}
    finally {
    	System.out.println("bye bye.....");
    	return -3;
    }
 }



	
	
	
	
}
