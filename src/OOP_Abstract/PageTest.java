package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {
		
		// we cannot create the object of abstract class
		Login l = new Login();
		l.title();  // overridden method
		l.url(); //overridden method
		l.timeOut(); // non overridden straight from parent
		Page.logo(); // static method called by Class name
		l.forgetPassword();// independent gto login
		
		// Top casting
		Page p =new Login();
		p.title();
		p.url();
		p.timeOut();   // independent form parent can be called but not independent form child
		Page.logo();// // independent form parent can be called but not independent form child
	}

}
