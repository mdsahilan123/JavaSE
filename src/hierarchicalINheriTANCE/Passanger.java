package hierarchicalINheriTANCE;

public class Passanger {
	private String name;
	private String email;
	private String contactNo;
	
	public Address add = new Address();
	 //Has a relationship
	
	//DEfining the public constructor
	public Passanger() {
		System.out.println("Passanger class public Constructor");
	}
	//Defining the public parameterized constructor
	public Passanger(String name,String email,String contactNo) {
		this.name=name;
		this.email=email;
		this.contactNo=contactNo;
	}
	//Defining the Business method for displaying passanger Information
	public void displayPassangerInformation() {
		System.out.println("Name of passanger::"+name +"contact_N of passanger ::"+contactNo+ "Email of passanger::"+email);
	}
	
}
