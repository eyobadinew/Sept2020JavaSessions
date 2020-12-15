package JavaSessions;

import java.util.ArrayList;

public class Eyobtraining {

	public static void main(String[] args) {
	
		
		 Object empdata[] = new Object[4];
		 empdata[0] = "Job";
		 empdata[1] = 37;
		 empdata[2] = 'M';
		 empdata[3] = 5.8;
		 
		 for(int i =0 ; i<empdata.length; i++) {
			 System.out.println(empdata[i]);
		 }
		 
		 int i = 0;
		 while(i<empdata.length) {
			 System.out.println(empdata[i]);
			 i++;
		 }
		 for(Object k :empdata) {
			 System.out.println(k);
		
			 }
		 ArrayList<Object> reg = new ArrayList<Object>();
		reg.add("Eyob");
		reg.add(37);
		reg.add('M');
		reg.add(6.2);
		 
		 reg.stream().forEach(k -> System.out.println(k));
		 
	   }

}
