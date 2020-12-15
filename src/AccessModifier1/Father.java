package AccessModifier1;

public class Father {

	public String name = "Hiwot";
	private int age = 32;
	protected Double salary = 5055.55;
	char gender = 'F';
	
		
	public static void main(String[] args) {
		  // same package same class all the four access modifiers are accessible.
		Father f = new Father();
	System.out.println(f.name);
	System.out.println(f.age);
	System.out.println(f.salary);
	System.out.println(f.gender);
	
	}
}
