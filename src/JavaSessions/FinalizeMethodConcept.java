package JavaSessions;

public class FinalizeMethodConcept {
	int age;

	public static void main(String[] args) {
		
		String s = new String("Naveen");

		FinalizeMethodConcept obj = new FinalizeMethodConcept();
		obj = null;
		//s = null;  finalize method called when only the class object ..obj.. turned null not when s is null.

		System.gc();
		System.out.println("Done!!!");

	}

	@Override
	public void finalize() {
		System.out.println("this is my finalize method....");
	}
	
	
	
}
