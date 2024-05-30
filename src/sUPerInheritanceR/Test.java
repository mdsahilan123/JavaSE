package sUPerInheritanceR;
public class Test extends Demo {
	
	//same fields  also available in parent class
	public  String message ="Mahesh it";
   public Test() {
	   //Giving call to parent public class constructor
	  // super();//if you want to you can write it
	   super("Welcome to Ashok it");
	   System.out.println("test");
   }
   public Test(String message) {
	   super(message);
   }
   public void display() {
	   System.out.println("message::"+message);
	  // System.out.println(" super message::"+super.message);
	   
	   super.dispplay();
   }
}
