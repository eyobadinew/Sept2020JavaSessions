package ConstructorConcept;

import java.util.ArrayList;

public class ConstructorHW {
/*1. Design a University class template with the following features:
		 variables:
		name
		country
		stablishedDate
		List of course provided in Array List<String>

		--Design the constructor of this class with different parameters and all parameters.

		--Write the get method of each variable with return keyword. */

private String name;
private String country;
private String stablishedDate;
private ArrayList<String> listOfCourses;

public ConstructorHW() {
	System.out.println("Constructor Home work");
	
}
public ConstructorHW(String name) {
	System.out.println("The name of the university  is" +name);
	this.name = name;
	
}
	
	public ConstructorHW(String name, String country) {
	this.name = name;
	this.country = country;
}
		
	
	public ConstructorHW(String name, String country, String stablishedDate) {
		this.name = name;
		this.country = country;
		this.stablishedDate = stablishedDate;
	}
	
	
	public ConstructorHW(String name, String country, String stablishedDate, ArrayList<String> listOfCourses) {
		this.name = name;
		this.country = country;
		this.stablishedDate = stablishedDate;
		this.listOfCourses = listOfCourses;
	}
	
	public String getName() {
		return name;
	}
/*	public void setName(String name) {
		this.name = name;
	}*/
	public String getCountry() {
		return country;
	}
	//public void setCountry(String country) {
		//this.country = country;
	//}
	public String getStablishedDate() {
		return stablishedDate;
	}
	//public void setStablishedDate(String stablishedDate) {
		//this.stablishedDate = stablishedDate;
	//}
	public ArrayList<String> getListOfCourses() {
		return listOfCourses;
	}
	//public void setListOfCourses(ArrayList<String> listOfCourses) {
		//this.listOfCourses = listOfCourses;
//	}
	
		
	}


