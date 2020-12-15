package ConstructorConcept;

import java.util.ArrayList;

public class ConstructorHWQ2main {

	public static void main(String[] args) {
		
		ConstructorHWQ2 browser = new ConstructorHWQ2("chrome");
		System.out.println(browser.getBrowserName());
		
		ConstructorHWQ2 browser1 = new ConstructorHWQ2("chrome","google");
		System.out.println(browser1.getBrowserName()+" "+ browser1.getVendorName());
		
		ConstructorHWQ2 browser2 = new ConstructorHWQ2("chrome","google","version10");
		System.out.println(browser1.getBrowserName()+" "+ browser1.getVendorName()+" "+browser2.getCurrentVersion());
		
		ArrayList<String> plugs = new ArrayList<>();
		plugs.add(" Adobe Flash Player");
		plugs.add("QuickTime");
		plugs.add("Java SE");
		plugs.add("Microsoft Silverlight");
		plugs.add("Unity");
		
		ConstructorHWQ2 browser3 = new ConstructorHWQ2("chrome","google","version10",plugs);
		System.out.println(browser1.getBrowserName()+" "+ browser1.getVendorName()+" "+browser2.getCurrentVersion()+" "+browser3.getPlugins());
        for(String plugins:plugs) {
        	System.out.println(plugins);
        }
	}

}
