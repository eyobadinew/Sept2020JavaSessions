package ThisKeyword;

public class CallThisEcommerce {

	public static void main(String[] args) {
		Ecommerce e = new Ecommerce();
		e
          .login("Eboy", "12345")
          .search("Apple watch")
          .search("Apple watch", 2000)
          .addTocart("Apple watch")
          .doPayment("123456678", "54321");
	// chain pattern created in the above case and semicolon only at last. Here we have returned (not created) the obj.
	// the advantage is that we can create a number of serious of cases... its all up to the customer to go all steps 
		//or avoid some.
		System.out.println("----------");
		
		e
        .login("unclesome", "1245")
        .search("Nike", 3000)
        .addTocart("Nike");
        
		
		
	}

}
