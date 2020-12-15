package OOP_Encapsulation;

public class EmployeeData {
 private String empName;
 private double empSalary;
 private int empAge;
 private int ssn;
 
 
	
	public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public double getEmpSalary() {
	return empSalary;
}

public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}

public int getEmpAge() {
	return empAge;
}

public void setEmpAge(int empAge) {
	this.empAge = empAge;
}

public int getSsn() {
	return ssn;
}

public void setSsn(int ssn) {
	this.ssn = ssn;
}
	/*public static void main(String[] args) {
		EmployeeData a = new EmployeeData();
	
		a.setEmpName("Elor");
		a.setEmpSalary(9000.0);
		a.setEmpAge(18);
		a.setSsn(12345678);
		
		System.out.println(a.empName);
		System.out.println(a.empAge);
		System.out.println(a.empSalary);
		System.out.println(a.ssn);
		System.out.println(a.empName+ " "+a.empAge+ " "+a.empSalary+ " "+a.ssn);
	}*/

}
