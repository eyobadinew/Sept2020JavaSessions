package OOP_Encapsulation;

public class LoginMain {

	public static void main(String[] args) {
		
	/*	LoginPage l = new LoginPage();
		l.setUserName("Mariamawit");
		l.setPassword("123@abc");
		//System.out.println(l.getUserName());
		//System.out.println(l.getPassword());
		l.doLogin();*/
	
		
		// call by constructor and commenting out the setter.
		LoginPage j = new LoginPage( "Mariamawit", "123@abc");
		j.doLogin();
		
	}

}
