package OOP_Abstract;

public class Login extends Page {

	
public Login() {
	System.out.println("Login constructor-----------"); // child class constructor .....called second
}
	@Override
	public void title() {
		System.out.println("Login page----title");		
	}

	@Override
	public void url() {
		System.out.println("Login page -----url");
	}
	// independent method to Login class
	public void forgetPassword() {
		System.out.println("Login page----- forgotpWD");
	}

}
