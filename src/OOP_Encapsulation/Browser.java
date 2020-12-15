package OOP_Encapsulation;

public class Browser {
	/*cusomer uses only lauch browser among the options given below. 
	hence hide the others with private and leave launch browser public.*/
	public void launchBrowser() {
		System.out.println("Launching browser......");
		CheckBrowserVesrion();
		CheckBrowserOsVesrion();
		intercatWithOperatingSystemServices(); 
		checkRAMSpace();
	}
	
	private void CheckBrowserVesrion() {
		System.out.println("CheckBrowserVesrion........");
	}

	private void CheckBrowserOsVesrion() {
		System.out.println("CheckBrowserOsVesrion........");
	}
	private void intercatWithOperatingSystemServices() {
		System.out.println("intercatWithOperatingSystemServices");
	}
    private void checkRAMSpace() {
    	System.out.println("Check RAM Space.......");
    }



}



