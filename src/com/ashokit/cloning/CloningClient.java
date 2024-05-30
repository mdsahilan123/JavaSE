package com.ashokit.cloning;

public class CloningClient {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee(123, "Ashok");
		emp.displayEmployeeDetails();
		System.out.println("Main object HashCode::::" + emp.hashCode());
		
		System.out.println("Main object of dependent Object Hash Code::::::"+emp.add.hashCode());
		System.out.println("***********Address Object*************");
		

		System.out.println("***********Cloned Object***********");
		Employee emp1 = (Employee) emp.clone();
		emp1.displayEmployeeDetails();
		System.out.println("Cloned Object HashCode::::" + emp1.hashCode());
		System.out.println("***********Address Object*************");
		emp1.add.DisplayAddressDetails();
		System.out.println("Cloned object of dependent Object Hash Code::::::"+emp1.hashCode());

		
		
		System.out.println("Programmer Doing the changes  in Address obj through .......");
	      emp1.add.cityName="pune";
	      emp1.add.DisplayAddressDetails();
	      System.out.println("Verifyinh the Main object of dependent Object ");
	      emp.add.DisplayAddressDetails();
	    
	    
	}
	
}
