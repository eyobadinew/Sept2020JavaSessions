package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		int a = 25;
		int b = 78;
		int c = 87;
		if(a>b&& b>c) 
		{System.out.println("The greatest:" +a);}
		else if (b>a && a>c){
			System.out.println("The greatest:"+b);
		}
		else {System.out.println("The greatest:"+c);
		}
		
		int p = 35;
		
		if(p>0) {
			System.out.println("Positive number");
		}
		else if (p<0) {
			System.out.println("Negative number");
		}
		else {System.out.println("The number is Zero");
		}
		
		
		int n = -11;
		if(n>0) {
			System.out.println("Positive number");
		}
		else if (n<0) {
			System.out.println("Negative number");
		}
		else {System.out.println("The number is Zero");
		}
	
	
	}

}
