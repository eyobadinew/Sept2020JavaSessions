package JavaSessions;

public class HWMethodsInJava {

	public static void main(String[] args) {
	HWMethodsInJava a = new HWMethodsInJava();
	a.getSum();
	
	int h = a.sum();
	System.out.println(h);
	
	int i =a.newSum(3000,7000);
	System.out.println(i);
	
    a.getProduct();
    
    int r = a.product();
    System.out.println(r);
	
    int s = a.newProduct(20, 40);
    System.out.println(s);
    
    a.circle();
	}
	//1. Write a program to print the sum of two numbers entered by user by defining your own method.
// A. no input and no return
	public void getSum(){
		int x = 4500;
		int y = 3500;
		int z = x+y;
		System.out.println(z);
	}
//B. no input and some return function;
	 public int sum() {
		 int f = 3000;
		 int g = 6000;
		 int h = f + g;
		 return h;
	 }
	//C.some input and some return;
	 public int newSum(int j, int k) {
		 int i = j + k;
		return i;
	 
	 }
	 //2. Define a method that returns the product of two numbers entered by user.
	// A. No input and No return
	 public void getProduct() {
		 int l = 25;
		 int m = 10;
		 int n = 4;
		 int o = l*m*n;
		 System.out.println(o);
	 }
		// B.  No input and Some return
	 
	 public int product() {
		 int p = 50;
		 int q = 15;
		 int r = p*q;
		 return r;
	 }
	// C.  Some input and Some return
	 public int newProduct(int s , int t) {
		 int u = s*t;
		 return u;
	 }
	 //3.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
	 
	 public void circle() {
		 final double r = 4.5;
		 double k = Math.PI;
		final int d = 2;
		 double l = d*k*r;
		 double n = k*r*r;
		 System.out.println(l);
		 System.out.println(n);
	 }
	
	}
		
		
		
	
 

