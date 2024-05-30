package demoSimple;

import java.util.Scanner;

public class ServiceImpl {
	
	
/*	//Defining the method for displaying values
		public void displayMobileInfo() {
			System.out.println("Mobile Model No :::::::" + modelNo);
			System.out.println("Mobile Price    :::::::" + price);
			System.out.println("Company Name    :::::::" + companyName);
		}
*/	
	public static void main(String[] args) {
		//Creating Mobile Object with out passing any data
		   //It will call Non-Parameterized Constructor and we are not sending any data
	           Mobile mob = new Mobile(); 
	          
		   //calling the displayMobileInfo();
		 //   mob.displayMobileInfo();
			
		    System.out.println("****************************************");
		    //It will call Parameterized constructor to Initialize the values 
		    Mobile mob1 = new Mobile("RealMeU1",25000.00d,"RealME");
		   // Scanner sc =new Scanner(System.in);
		    
		      System.out.println( mob1.getModelNo());
	          System.out.println(mob1.getMobilePrice());
	          System.out.println(mob1.getCompanyName());
			
		    //calling the displayMobileInfo() using mob1 object
		  //  mob1.displayMobileInfo();
		    
		    System.out.println("******************************************");
		    //It will call two Parameterized constructor to Initialize the values
		    Mobile mob2 = new Mobile("SAMSUNGM31","Samsung");
		    
		    //calling the displayMobileInfo() using mob2 object
		  //  mob2.displayMobileInfo();
		    
		    System.out.println("**********************************************");
		    Mobile mob3 = new Mobile("IPHONE7","APPLE",60000.00d);
		    
		    //calling the displayMobileInfo()
		 //   mob3.displayMobileInfo();
		
	
	}
}
