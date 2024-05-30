package diFFerntClassSuper;

public class Demo1 {

	private String message="Ashok IT";
   public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
public Demo1() {
	   System.out.println("Demo");
   }
   public Demo1(String message ) {
	   System.out.println("Demo1 class parant constructor");
	   this.message=message;
   }
   public void dispplayMessage() {
	   System.out.println(message);
   }
}


