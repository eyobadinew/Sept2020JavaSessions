package OOP_Interface;

public class TestUniversity {

	public static void main(String[] args) {
		
		AAUuniversity c = new AAUuniversity();
		c.agricultureSchool();
		c.architectureSchool();
		c.artSchool();
		c.businessSchool();
		c.commercialSchool();
		c.engineeringSchool();
		c.lawSchool();
		c.musicSchool();
		c.naturalScienceSchool();
		c.socialScienceSchool();
		c.adminstration();    // inherited from parent class CenralizedUniversity
		c.qualityAssurance(); // inherited from Grand parent interface UNeducation
		c.language(); // inherited form Great Grand parent interface WorldEducation
		USeducation.minimumFee();  // static method called by its interface name ...USeducation
	System.out.println(USeducation.admission_fee); // a variable called by its interface name
	//	USeducation.admission_fee(); // a variable can't be called directly instead use the above format.
		// we can't create object for interfaces. hence use only Top casting

		USeducation c1 = new AAUuniversity(); // only the four logics from USeducation will be called
		c1.artSchool();
		c1.businessSchool();
		c1.engineeringSchool();
		c1.lawSchool();
		
		
	}

}
