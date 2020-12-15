package JavaSessions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class HashMapConcept {

	public static void main(String[] args) {
			// Import both Map and HashMap from java. util			
		Map<String, String> phoneBook = new HashMap<String,String>();
    phoneBook.put("Eyob", "4156120866");
    phoneBook.put("Luna", "4153047866");
    phoneBook.put("Job","251911951979");
    
    System.out.println(phoneBook.get("Jo"));
 
    // entrySet.... to call key value pairs
    for(Map.Entry<String, String> entry: phoneBook.entrySet()) {
    	System.out.println("Key = "+entry.getKey()+ "Values " +entry.getValue());
    	
    	System.out.println("------------------------");
   // Lambda ...from JDK 8 onwards
    	phoneBook.forEach((a,b) -> System.out.println("Key :"+a+ ": value "+b));
   
   System.out.println("------------------------");
    Set<String> keys = phoneBook.keySet();
    for(String i:keys) {
    	System.out.println(i + " : "+ phoneBook.get(i));
    }
    }
    	
    
    
	}

}
