package this2NDuseSChaning;

//This class is used to demonstrating the second purpose of this keyword
public class Customers {
	private String cname;
	private float salary;

	// public constructor
	public Customers() {
		System.out.println("Customers class public Constructors....");
	}

	// public constructor with single parameterized
	public Customers(String cname) {
		// calling to public constructor
		this();
		System.out.println("Customers class public constructor with single parameterized");
		this.cname = cname;
	}

	// public constructor with two parameterized
	public Customers(String cname,float salary) {
	   //calling single parameterized constructor;
	    this(cname);
	    this.salary=salary;
	   System.out.println("public class with two parameterized");
   }
       public void displpay() {
    	   System.out.println("Customers name::::"+cname);
    	   System.out.println("Customers saalry::::"+salary);
       }
	public static void main(String[] args) {
		Customers cu=new Customers("Mahesh",25000.0f);//calling the two parameterized constructor
		cu.displpay();
	}

}
