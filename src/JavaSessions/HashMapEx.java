package JavaSessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, String> employeeData = new HashMap<String, String>();
		employeeData.put("First Name", "Solomon");
		employeeData.put("Last Name", "Solomon");
		employeeData.put("Gender", "Male");
		employeeData.put("Phone number", null);
		employeeData.put("City", "San Francisco");
		employeeData.put("Country", "USA");
		employeeData.put(null, "37");
		employeeData.put(null, "Black African American");  // multiple null key not allowed and the latest value override the previous
		employeeData.put("Height", null);  // multiple null values are possible
		
		System.out.println(employeeData.get("Gender"));
		System.out.println(employeeData.get("Age"));  // no age data hence  default value null surfaces
		// to print all the key value pair...
		employeeData.forEach((a,b) -> System.out.println("key :" +a + "Value"+b));
		
		// to have clear picture
		System.out.println("--------------");
		employeeData.forEach((a,b) -> System.out.println(a + ":"+b));
		
		
		
		
		
		
		
		
		
		
		

	}

}
