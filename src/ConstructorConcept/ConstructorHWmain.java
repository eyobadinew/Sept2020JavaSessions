package ConstructorConcept;

import java.util.ArrayList;

public class ConstructorHWmain {

	public static void main(String[] args) {
		ConstructorHW a = new ConstructorHW("Addis Ababa University");
		a.getName();
		
		ConstructorHW b = new ConstructorHW("Addis Ababa University","Ethiopia");
		System.out.println(b.getName()+ " "+b.getCountry());
		
		ConstructorHW c = new ConstructorHW("Addis Ababa University","Ethiopia","01/01/1957");
		System.out.println(c.getName()+ " "+c.getCountry()+ " "+c.getStablishedDate());
		
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Networking");
		courses.add("SQL");
		courses.add("API");
		courses.add("Automation");
				
		ConstructorHW d = new ConstructorHW("Addis Ababa University","Ethiopia","01/01/1957",courses);
		System.out.println(d.getName()+ " "+d.getCountry()+ " "+d.getStablishedDate()+" "+d.getListOfCourses());
		System.out.println(courses.size());
		System.out.println(courses.get(0));
		System.out.println(courses.get(3));
	}

}
