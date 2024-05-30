package sUPerInheritanceR;

public class Demo {
   String message="Ashok it";
   public Demo() {
	   System.out.println("Demo");
   }
   public Demo(String message ) {
	   System.out.println("Demo class param constructor");
	  
	   this.message=message;
   }
   public void dispplay() {
	   System.out.println(message);
	   System.out.println("parant class display method::"+ message);
   }
}
