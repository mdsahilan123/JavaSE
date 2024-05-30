package demoSimple;

public class Mobile {

	//Declaring the Fields
	private String modelNo;
	private double price;
	private String companyName;
	
	
	
	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public double getMobilePrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	//Defining the Constructor
	public Mobile() {
		System.out.println("Mobile Class Non-Parameterized Constructor.......");
	}
	
	//Defining the Parameterized Constructor
	public Mobile(String mobileModel,double mobilePrice,String compName) {
		System.out.println("Mobile Class Three Parameterized Constructor......");
		modelNo = mobileModel;
		price = mobilePrice;
		companyName = compName;
	}
	
	
	
	//It will call Non-Parameterized Constructor and we are not sending any data
	public Mobile(String mobileModel,String compName,double mobilePrice) {
		System.out.println("Mobile Class Three Parameterized Constructor Changed in Order......");
		modelNo = mobileModel;
		price = mobilePrice;
		companyName = compName;
	}
	
	//Defining the another Parameterized Constructor
	public Mobile(String mobileModel,String compName) {
		System.out.println("Mobile Class Two Parameterized Constructor......");
	    modelNo = mobileModel;
	    companyName = compName;
	}
}


