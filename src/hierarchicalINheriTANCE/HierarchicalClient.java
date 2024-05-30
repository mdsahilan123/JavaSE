package hierarchicalINheriTANCE;

public class HierarchicalClient {
   public static void main(String args[]) {
	   //creating the object of trainer class
	   Trainer t=new Trainer(1234,"Mahesh",6.5f);
	 //calling super class method using trainer object
	   t.setpersonDetail("Mahesh ,", "Mahesh7@gmail.com","1223445343");
	   
	   //calling the display method for values
	   t.displaypersonDetails();
	   t.displayTrainer();
	   System.out.println("===============================================");
	   //creating the object of developer class
	   Developer dev=new Developer("java","25000.0",5.3f);
	   //using dev class object accessing the parent class methods
	   dev.setpersonDetail("AShok", "ashok12@gmail.com","13234535");
	   dev.displayDeveloperInformation();
	  /* System.out.println("Hexadecimal code of a hash code"+Integer.toHexString(t.hashCode())); 
	   System.out.println("Trainer class object hashcode "+t.hashCode());
	   */
	   //printing the trainer object
	   System.out.println(t.toString());
	   //printing the developer object
	   System.out.println(dev.toString());
   }
}
