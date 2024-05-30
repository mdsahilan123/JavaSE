package hierarchicalINheriTANCE;
 public class Person {
   public String name;
   public String emailID;
   public String contactno;
   
   //Defining business method for setting values of a person
   public void setpersonDetail(String name,String emailID,String contactno) {
	   this.name=name;
	   this.emailID=emailID;
	   this.contactno=contactno;
   }
	   //Defining the business method for defining the person values
	   public void displaypersonDetails() {
		 System.out.println("*****personal information*******");
		 System.out.println("Person Name::,"+name  +"  PersonEmailID::"+emailID + " Person contactNO ::," +contactno);
		 
	   }
   }
 
