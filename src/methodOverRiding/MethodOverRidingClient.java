package methodOverRiding;

public class MethodOverRidingClient {

	public static void main(String[] args) {
		EmployeApprasialpdfform  epf= new EmployeApprasialpdfform();
		System.out.println(epf.getEmployeform());
		System.out.println(epf.geTypeofForm());
		//Creating the object of sub class
		
		EmployeApprasialpdfform eapf=new EmployeApprasialpdfform();
		System.out.println(eapf.getEmployeform());
		System.out.println(eapf.geTypeofForm());
		
	}
}
