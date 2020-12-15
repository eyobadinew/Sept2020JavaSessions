package JavaSessions;

import java.util.ArrayList;

public class Employee {

	public static void main(String[] args) {
		Employee a = new Employee();
		String t[] = a.empAsset("paul");
		for (String s : t) {
			System.out.println(s);
		}
	String h[] = a.empAsset("kid");
	for(String l :h) {
		System.out.println(l);
	}
	ArrayList<String> order = a.customerOrder("Ephie");
	for(String f : order) {
		System.out.println(f);
	}
	ArrayList<String> b = a.customerOrder("Munir");
	for(String y : b) {
		System.out.println(y);
	}
	
	
	}
	
	
	//WAM: where we have to pass the emp name and return the employee assets
				// array

public String[] empAsset(String name) {
	System.out.println("The asset for employee named "+name+ " is :");
String asset[] = new String[4];
   
   
  if(name.equals("Endalk")) {
	   asset[0] = "chair";
	   asset[1] = "table";
	   asset[2] = "Laptop";
	   asset[3] = "Desktop";  
  }
  else if(name.equals("paul")) {
	  asset[0] = "Mouse";
	  asset[1] = "table";
	  asset[2] = "Laptop";
	  asset[3] = "Desktop";
  
  }
 else {System.out.println("The person named"+name+"is unknown");
 ;}
  return asset;
}

//WAM: where we have to pass the Customer name and return the employee order form amazon array
public ArrayList<String> customerOrder(String name) {
	System.out.println("The order for customer name "+name+ "includes :");
	ArrayList<String> order = new ArrayList<String>();
	if(name.equals("Munir")) {
	order.add("Shoes");
	order.add("Tshirt");
	order.add("Pant");
	order.add("Perfume");
	}
	else if (name.equals("Ephie")) {
		order.add("Shoes");
		order.add("Toys");
	}
	else {System.out.println("The order for customer named "+name+ " is unknown");
	return null;}
    return order; 
}
 

}
