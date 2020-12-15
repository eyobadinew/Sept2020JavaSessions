package OOP_Interface;

public interface USeducation extends UNeducation{
     
	int admission_fee = 100;   // interface variables are static and final
	public void lawSchool();
	public void businessSchool();
	public void engineeringSchool();
	public void artSchool();
	
	public static void minimumFee() {
		System.out.println("Minimum fee is $50");
	} 
	
	
}
