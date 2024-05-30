package aBstractCl;

public class AbstractModifierClient {
	public static void main(String[] args) {
  //creating the  sub class object and holding into parent class variable
		DB2databseConnectivity dc=new DB2databseConnectivity("Oracledb","21C");
		//calling the subclass implementation of abstract method  
		System.out.println(dc.ConnectToDatabase());
		//calling the Business method and for displaying database name and version
		dc.showdatabaseinfo();
		System.out.println("**************************************");
		dc=new DB2databseConnectivity("IBM","10.x ");
		//calling the implementation method of an abstract method 
		System.out.println(dc.ConnectToDatabase());
		//calling the business method for displaying database name and version 
		dc.showdatabaseinfo();
		//providing the abstract class  object installation is possible or not 
		//DatabaseCon dc1 =new DatabaseCon();	
			
		
	}

}
