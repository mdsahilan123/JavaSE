package copyConstruct;

public class Mobile {
	//Declaring the variable
	private String modelno;
	private double price;
	private String companyname;
	//Defining the constructor
	public Mobile() {
		System.out.println("Mobile class non-parameterized constructor..");
	}
	//Defining the parameterize constructor
	public Mobile (String mobileModel,double mobileprice,String compname) {
		System.out.println("Mobile class three paramitrized constructor");
		modelno=mobileModel;
		price=mobileprice;
		companyname=compname;
		
	}
	//it will non-parameterized we are not sending any data
	public Mobile(String mobileModel,String compname,double mobileprice) {
		System.out.println("Mobile class three parametrize constructor changed in order");
		modelno=mobileModel;
		companyname=compname;
		price=mobileprice;
	}
	//Defining another parameterized constructor
	public Mobile(String mobileModel,String compName) {
		System.out.println("Mobile Class Two Parameterized Constructor......");
	    modelno = mobileModel;
	    companyname = compName;
	}
	//Defining the another Parameterized constructor which accepts Mobile as Parameter
   public Mobile(Mobile mob) {
	   System.out.println("Mobile class copy constructor..");
	   modelno=mob.modelno;
	   price=mob.price;
	   companyname=mob.companyname;
   }
	   //Defining the method to displaying values
	   public void displaymobileinfo() {
		    System.out.println("Mobile Model No :::::::" + modelno);
			System.out.println("Mobile Price    :::::::" + price);
			System.out.println("Company Name    :::::::" + companyname);
	   }
	   
	public static void main(String args[]) {
		
	     //Creating Mobile Object with out passing any data
	     //It will call Non-Parameterized Constructor and we are not sending any data
	     Mobile mob = new Mobile(); 
		
	     //calling the displayMobileInfo();
	     mob.displaymobileinfo();
		
	     System.out.println("****************************************");
	    //It will call Parameterized constructor to Initialize the values 
	    Mobile mob1 = new Mobile("RealMeU1",25000.00d,"RealME");
	    
	    //calling the displayMobileInfo() using mob1 object
	    mob1.displaymobileinfo();
	    
	    System.out.println("******************************************");
	    //It will call two Parameterized constructor to Initialize the values
	    Mobile mob2 = new Mobile("SAMSUNGM31","Samsung");
	    
	    //calling the displayMobileInfo() using mob2 object
	    mob2.displaymobileinfo();
	    
	    System.out.println("**********************************************");
	    Mobile mob3 = new Mobile("IPHONE7","APPLE",60000.00d);
	    
	    //calling the displayMobileInfo()
	    mob3.displaymobileinfo();
	    
	    System.out.println("************************************************");
	    
	    Mobile mob4 = new Mobile(mob3); //mob3 is an existing object where mob4 is newly created object
	    mob4.displaymobileinfo();
	   
   }
}
