package ConstructorConcept;

import java.util.ArrayList;

public class ConstructorHWQ2 {
	/*2. Design a browser class template with the following features:
		 variables:
		browserName
		vendorName
		currentVersion
		List of plugins supported by Browser in Array List<String>

		--Design the constructor of this class with different parameters and all parameters.

		--Write the get method of each variable with return keyword*/

	private String browserName;
	private String vendorName;
	private String currentVersion;
	private ArrayList<String> plugins;
	
	public ConstructorHWQ2(String browserName) {
		this.browserName = browserName;
	}
	
	public ConstructorHWQ2(String browserName, String vendorName) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		}
	public ConstructorHWQ2(String browserName, String vendorName,String currentVersion) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
				}
	public ConstructorHWQ2(String browserName, String vendorName,String currentVersion,ArrayList<String> plugins) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.plugins = plugins;
				}

	public String getBrowserName() {
		return browserName;
	}

	
	public String getVendorName() {
		return vendorName;
	}

	
	public String getCurrentVersion() {
		return currentVersion;
	}

	
	public ArrayList<String> getPlugins() {
		return plugins;
	}

	
	
	
}
