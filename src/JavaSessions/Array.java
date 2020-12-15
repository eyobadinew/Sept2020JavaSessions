package JavaSessions;

public class Array {

	public static void main(String[] args) {
	//integer
		// for loop
		int i[]= new int[6];
		i[0]= 100;
		i[1]= 200;
		i[2]= 300;
		i[3]= 400;
		i[4]= 500;
		i[5]= 600;
		
		for(int t=0; t<i.length;t++) {
			System.out.println(i[t]);
		}
	
		// for each loop			
		for(Integer t:i) {
			System.out.println(t);
		}
		
	// String
		String s[] = new String[3];
		s[0] = "Elor";
		s[1] = "Mariamawit";
		s[2] = "Eyob";

		System.out.println(s.length);
		System.out.println(s[1]);
		
		// for loop
		
		for(int e=0; e<s.length; e++) {
		System.out.println(s[e]);}
	
	
	// for each loop
	for(String e:s) {
		System.out.println(e);}
	
	// character
	char c[]= new char[3];
	c[0] ='m';
	c[1]= 'f';
	c[2] ='b';
			System.out.println(c.length);
	// character for loop	
			for(int p=0; p<c.length; p++) {
				System.out.println(c[p]);
			}
	//	character for each loop	
			for(Character p:c) {
				System.out.println(p);
			}
			
			//Object Static Array
			Object n[]= new Object[5];
			n[0] = "Eyob";
			n[1] = 37;
			n[2] = 12.44;
			n[3] = 'M';
			n[4] = true;
					
				System.out.println(n.length);	
				
			//	for loop
				for(int g=0; g<n.length; g++) {
					System.out.println(n[g]);
				}
			// for each loop
				for(Object g:n) {
					System.out.println(g);
				}
	}

}
