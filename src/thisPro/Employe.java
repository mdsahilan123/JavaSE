package thisPro;
public class Employe {
	//instance fields
	private int empid;
	private String empname;
	//Define constructor;
	public Employe() {
		System.out.println("Employe class with public with no parameter..");
	}
	//Defining the parameterized constructor
	//constructor local and instance fields are same
	public Employe(int empid,String empname) {
		    this.empid=empid;
		    this.empname=empname;
	}
	 //Defining the method with parameters;
	public void assignvalues(int empid,String empname) {
		     this.empid=empid;
		     this.empname=empname;
	}
	public void display() {
		System.out.println("empid of staff:::"+empid);
		System.out.println("empname of staff::"+empname);
	}
   public static void main(String args[]) {
	   //creating the object 
	   Employe e=new Employe();//public constructor with no parameter
	   //calling method
	   e.assignvalues(12, "JHON");//Method call
	   e.display();
	   System.out.println("===================================");
	   Employe e1=new Employe(16,"BLAKE");
	   e1.display();
	   System.out.println("======================================");
	   Employe e2=new Employe(20,"ADVIN");
	   e2.display();
   }
}
