package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class HwArrayList {

	public static void main(String[] args) {
		//1. Write a Java program to create a new array list, add some colors (string) and print out the collection

		ArrayList<String> color = new ArrayList <String>();
		color.add("Blue");
		color.add("Yellow");
		color.add("Green");
		color.add("White");
		color.add("Black");
		
		System.out.println(color.size());
		System.out.println(color.get(2));
		System.out.println("---------------------");
		//for loop
		for(int i =0; i<color.size(); i++) {
			System.out.println(color.get(i));
		}
		System.out.println("---------------------");
	// for each loop
		for(String s : color) {
			System.out.println(s);
		}
		System.out.println("---------------------");	
	// Java Stream
		color.stream().forEach(paints -> System.out.println(paints));
		System.out.println("-------------");
	//2.  Write a Java program to insert an element into the array list at the first and last positions.
	
	color.add(0, "Red");
	color.add(6,"Pink");
	
	color.stream().forEach(c-> System.out.println(c));
	System.out.println("-------------");
	//3. Write a Java program to retrieve an element (at a specified index) from a given array list.
	String t = color.get(0);
	System.out.println("First number: " +t);
	t = color.get(3);
	System.out.println("The fifth number: " +t);
	
	System.out.println("-------------");
	//4.Write a Java program to update specific array element by given element.
	// to replace blue(1) by purple
	
	color.set(1, "Purple");
	color.stream().forEach(y -> System.out.println(y));
	System.out.println("-------------");
	//5. Write a Java program to remove the third element from a array list. 
	color.remove(2);
	color.stream().forEach(r -> System.out.println(r));
	System.out.println("-------------");
	//6.Write a Java program to search an element in an array list.
	   // to search Black
	if(color.contains("Black")){
		System.out.println("Match Found");
	}
	else {System.out.println("No Match");}
	System.out.println("-------------");
	//7.Write a Java program to reverse elements in an array list
	 System.out.println("List before reversing :\n" + color); 
	 Collections.reverse(color);
	 System.out.println("List after reversing :\n" + color); 
	 System.out.println("-------------");
	 
	 //8.Write a Java program to extract a portion of an array list. 
	 
	 
	}
	
}
