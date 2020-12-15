package OOP_Encapsulation;

public class EmployeeDatapublic {

		public static void main(String[] args) {
			EmployeeData a = new EmployeeData();
		
			a.setEmpName("Elor");
			a.setEmpSalary(9000.0);
			a.setEmpAge(18);
			a.setSsn(12345678);
			
			System.out.println(a.getEmpName());
			System.out.println(a.getEmpAge());
			System.out.println(a.getEmpSalary());
			System.out.println(a.getSsn());
			System.out.println(a.getEmpName()+ " "+a.getEmpAge()+ " "+a.getEmpSalary()+ " "+a.getSsn());
		}
	}


