package oopsM;
public class Mobile {
	//declaring the fields
	private String mobileno;
	private double price;
	private String companyname;
	public Mobile() {
		System.out.println("Mobile class non parametrize constructor..");
	}
	//Defining the Parameterize constructor
	public Mobile(String mobileno, double price, String companyname) {
		
		this.mobileno = mobileno;
		this.price = price;
		this.companyname = companyname;	}
	//Defining the method for displaying the values 
	public void displayMobileinfo() {
		System.out.println("moblie no="+mobileno);
		System.out.println("moblie price= "+price);
		System.out.println("Company name= "+companyname);	}
	  public static void main(String[] args) {
		Mobile mob=new Mobile("samsung A32",15000.0d,"samsung");
		mob.displayMobileinfo();
	//	Mobile mob1=new Mobile();
		
	}}