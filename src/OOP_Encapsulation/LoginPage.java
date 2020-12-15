package OOP_Encapsulation;

public class LoginPage {
	
	private String userName;
	private String password;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void doLogin() {
		System.out.println("Login with username " +userName+ " and Password" +password);
	}
	
	//login with constructor by commenting out setter...as constructor can replace getter.... 
	public LoginPage(String userName , String password){
		this.userName = userName;
		this.password = password;
		
	}

}
