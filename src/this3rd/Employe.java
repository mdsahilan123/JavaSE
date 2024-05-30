package this3rd;

//This class is used to demonstrating the Third purpose of this keyword
public class Employe {
	private String cname;
	private float salary;

	// public constructor
	public Employe() {
		System.out.println("Customers class public Constructors....");
	}

	// public constructor with single parameterized
	public Employe(String cname) {
		// calling to public constructor
		this();
		System.out.println("Customers class public constructor with single parameterized");
		this.cname = cname;
	}

	// public constructor with two parameterized
	public Employe(String cname,float salary) {
	   //calling single parameterized constructor;
	    this(cname);
	    this.salary=salary;
	   System.out.println("public class with two parameterized");
   }
       public void displpayempdetails() {
    	   System.out.println("Customers name::::"+cname);
    	   System.out.println("Customers saalry::::"+salary);
       }
       public Employe getemployeObject() {
    	   return this;
       }
	public static void main(String[] args) {
		Employe emp=new Employe("Mahesh",25000.0f);//calling the two parameterized constructor
		emp.displpayempdetails();
		System.out.println("===================================");
		emp.getemployeObject().displpayempdetails();
	}

}
