package diFFerntClassSuper;

public class Test1 extends Demo1 {
	private String message="Mahesh it";
	public Test1() {
		// Giving call to parent public class constructor
		// super();//if you want to you can write it
		super("Welcome to Ashok it");
		System.out.println("test");
	}
	public Test1(String message) {
		super(message);//giving call to parent class constructor
	}
	public void display() {
		System.out.println("Message  "+message);
		System.out.println("Message  "+super.getMessage());
	}
	
}