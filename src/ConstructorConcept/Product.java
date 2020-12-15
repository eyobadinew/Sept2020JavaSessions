package ConstructorConcept;

import java.util.ArrayList;

public class Product {

	String name;
	Double price;
	String color;
	ArrayList<String> sellerList;
	
	
	
	
	public Product(String name, Double price) {
		
		this.name = name;
		this.price = price;
	}

	
	public Product(String name, Double price, String color) {
		
		this.name = name;
		this.price = price;
		this.color = color;
	}

	
	public Product(String name, Double price, String color, ArrayList<String> sellerList) {
		
		this.name = name;
		this.price = price;
		this.color = color;
		this.sellerList = sellerList;
	}



	/*public static void main(String[] args) {
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

	
	
	
	
	
	}*/

	      
}
