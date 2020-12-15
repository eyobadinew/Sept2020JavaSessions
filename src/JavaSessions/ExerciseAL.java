package JavaSessions;

import java.util.ArrayList;

public class ExerciseAL {

	public static void main(String[] args) {
		ExerciseAL s = new ExerciseAL();
		ArrayList<String> x = s.amazon("Frehiwot");
		System.out.println(x);
		for(String h :x) {
			System.out.println(h);
		}
	}
	//WAM: where we have to pass the Customer name and return the employee order form amazon array
	
	public ArrayList<String> amazon(String name){
		System.out.println("The assets for customer named " +name+ " are");
		ArrayList<String> x = new ArrayList<String>();
		if(name.equals("Frehiwot")) {
			x.add("Bed");
			x.add("Table");
			x.add("Laptop");
			
		}
		else if(name.equals("Tati")) {
			x.add("Desktop");
			x.add("Refridgrator");
			x.add("TV");
			
		}
		else {System.out.println("The name " +name+ " is unknown");}
		return x;
	}
	
	
}
