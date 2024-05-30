package com.ashokit.cloning;

public class Address implements Cloneable {
    
	public String doorNo;
	public String cityName;
	 
	public Address() {
		System.out.println("Address class public Non-paramitrized constructor ");
	}

	public Address(String doorNo, String cityName) {
		System.out.println("Address Class public paramitrized Contructor::::");
		this.doorNo = doorNo;
		this.cityName = cityName;
	}
	
	public void DisplayAddressDetails() {
		System.out.println("Door No:::"+doorNo);
		System.out.println("City Name::::"+cityName);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
} 
