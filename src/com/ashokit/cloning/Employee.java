package com.ashokit.cloning;

public class Employee implements Cloneable {
	private int eid;
	public String empName;
    //creating the Address class Object 
	public Address add=new Address("1-2-3","Hydrabad");
	
	public Employee() {
		System.out.println("Employee class public non-paramitrized constructor...");
	}

	public Employee(int eid, String empName) {
		System.out.println("Employee class public paramitrized constructor...");
		this.eid = eid;
		this.empName = empName;
	}

	// Business Method
	public void displayEmployeeDetails() {
		System.out.println("Employee ID::::" + eid);
		System.out.println("Employee Name:::" + empName);
	}

	// overriding the clone method from java.lang.Object
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
