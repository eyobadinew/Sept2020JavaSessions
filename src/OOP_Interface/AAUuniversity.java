package OOP_Interface;

public class AAUuniversity extends CentralizedUniversity
                           implements USeducation,UKeducation,Kenyaeducation {
// USeducation
	@Override
	public void lawSchool() {
		System.out.println("US-----law school");
	}

	@Override
	public void businessSchool() {
		System.out.println("US-----businessSchool");
	}

	@Override
	public void engineeringSchool() {
		System.out.println("US-----engineeringSchool");	
	}

	@Override
	public void artSchool() {
		System.out.println("US-----artSchool");	
	}
// UKeducation
	@Override
	public void agricultureSchool() {
			System.out.println("UK ------agrischool");	
	}

	@Override
	public void naturalScienceSchool() {
		System.out.println("UK ------naturalschool");		
	}
// Kenyaeducation
	@Override
	public void socialScienceSchool() {
		System.out.println("Kenya-------socialschool");
			}

	@Override
	public void architectureSchool() {
		System.out.println("Kenya-------architectureschool");
			}

	// non overridden methods/ independent to AAUuniversity
	public void commercialSchool() {
		System.out.println("AAU-----school of commerce");
	}
	public void musicSchool() {
		System.out.println("AAU-----music school");
	}
 // UNeducation....Grand parent interface inheritance
	@Override
	public void qualityAssurance() {
		System.out.println("UN------education quality");	
	}
// WorldEducation inherited from greatGrand parent WorldEducation
	@Override
	public void language() {
		System.out.println("English mode of communication");
		
	}
	
}
