package aBstractCl;
//Defining the abstract class given by sunmicroSystem for just assumption


public abstract  class DatabaseCon {
	public String databaseName;
	public String dbversion;
	
	
	  //Defining the non parameterized constructor
	public DatabaseCon() {
		System.out.println("Databse Conctivity class public Constructor.....");
	}
	//Defining the parameterized constructor
	public DatabaseCon(String databse,String dbversion) {
		System.out.println("DatabseConctivity class public parametrized Constructor");
		this.databaseName=databse;
		this.dbversion=dbversion;
	}
	//Defining the abstract method
	public abstract String ConnectToDatabase();
	//Defining the BusinessMethod for defining the databaseName
	public void showdatabaseinfo() {
		System.out.println("Databse name ::::"+databaseName);
		System.out.println("Database Version:::"+dbversion);
		
	}
	
}
