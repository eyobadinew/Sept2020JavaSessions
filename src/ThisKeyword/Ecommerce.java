package ThisKeyword;

public class Ecommerce {

	public Ecommerce login(String un,String pwd) {
		System.out.println("Login with username :" +un +"and password" +pwd);
		return this;
	}
	public Ecommerce search(String productName) {
		System.out.println("find the product named :"+productName);
	    return this;
	}
	public Ecommerce search(String productName,int price) {
		System.out.println("the product name is :"+productName+ "and the price is" +price);
	    return this;
	}
	public Ecommerce addTocart(String productName) {
		System.out.println("Add to cart the product named :"+productName);
	    return this;}
	 public Ecommerce doPayment(String CC, String pwd) {
			System.out.println("Credit card number :"+CC + "The password is :" +pwd);
		    return this;}
	 
}
