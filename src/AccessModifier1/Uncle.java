package AccessModifier1;

public class Uncle {

	public static void main(String[] args) {
		 Uncle u =  new Uncle();
		// System.out.println(u.name);  // impossible as there is no relationship same package different class
		 // therefore create the Father class object
    Father f =  new Father();
    System.out.println(f.name);
    System.out.println(f.gender);
    System.out.println(f.salary);
		 // all accessible except private so where
	}

}
