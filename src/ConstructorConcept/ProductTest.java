package ConstructorConcept;

import java.util.ArrayList;

public class ProductTest {

	public static void main(String[] args) {
		// here we have separated the tamplate(Constructor and Class) on one page and the main method here separately.
			Product p1 = new Product("Nike Shoes" , 4000.0);
			System.out.println(p1.name+ " "+ p1.price+" "+ p1.color);
		
			Product p2 = new Product("Laptop" , 6000.0,"Black");
			System.out.println(p2.name+" "+p2.price+" "+p2.color);
			
			ArrayList<String> comsellerlist = new ArrayList<String>();
			comsellerlist.add("ABC trading");
			comsellerlist.add("3F");
			comsellerlist.add("WinWin");
			
			Product p4 = new Product("Dedsktop", 5000.0,"Blue",comsellerlist);
			System.out.println(p4.name+ " "+ p4.price+" "+p4.color+ " "+p4.sellerList);

			
		}
	}


