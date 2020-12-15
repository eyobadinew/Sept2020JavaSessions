package JavaSessions;

public class MethodsHw {
     
	public static void main(String[] args) {

		int h = MethodsHw.smallest(100,200,500);
		System.out.println(h);
		
		int g = MethodsHw.max(300,500,600);
		System.out.println(g);
	 
		 MethodsHw t = new MethodsHw();
		 t.oddeven(7);
		
		 t.vote(19);
	
			 }
	 //4.Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
	public static int smallest(int first, int second, int third) {
		System.out.println("The minimum number is :");
		int min = first; 
	if (second < min){
		min = second; 
		}  
	else if (third < min) { 
		min = third;
		} 
	return min;
	}
public static int max (int first, int second , int third) {
	System.out.println("The maximum number is :" );
	int max = first;
	if (second > max){
		max = second; 
		}  
	else if (third > max) { 
		max = third;
		} 
	return max;
	}
//5. Define a program to find out whether a given number is even or odd
public int oddeven(int x){
//int x =6;
int reminder = x%2;
if(reminder == 0) {
System.out.println("The number" +x+ " is even");
}
else {System.out.println("The number" +x+ " is odd");}
return x;
}

/* 6.A person is elligible to vote if his/her age is greater than or equal to 18. 
Define a method to find out if he/she is elligible to vote.*/
 public int vote(int u) {
	 if(u>=18) {
		 System.out.println( "Age " +u+ " is elligible to vote");
	 }
	 else {System.out.println("Age "+u+" is not elligible to vote");}
	 return u;
 }

 //7. Define a method to find out if number is prime or not.


}


	
	
	
	
	
