package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//ArrayList is a default class in Java
		//dynamic array
		//order based/index based arraylist/collection
		//Li = 0
		//Hi = size -1
		//size = ar.size()
		
		ArrayList<String> country = new ArrayList<String>();
		System.out.println(country.size());
		country.add("Ethiopia");
		country.add("USA");
		country.add("Kenya");
		country.add("Canada");
		System.out.println(country.size());
		System.out.println(country.get(0));
		System.out.println(country.get(1));
		//to print all the values (countries) use --- for loop
		
		for(int i=0; i<country.size();i++) {
			System.out.println(country.get(i));
		}
		System.out.println("========");
		//for each loop
		for(String s: country) {
			System.out.println(s);
		}
		//java stream
		
		country.stream().forEach(ct-> System.out.println(ct));
	}
	}
