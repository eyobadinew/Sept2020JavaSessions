package OOP_Abstract;

public abstract class Page {
	
	public Page() {
		System.out.println("Page Constructor--------");        // parent class constructor..... called first
	}
	
	
	// Abstract methods/ with out body
	public abstract void title();
	public abstract void url();

	// non abstract method
	public void timeOut() {
		System.out.println("Page....... time out");}
	
	public static void logo() {
		System.out.println("Page----logo");
	}
	
	}

