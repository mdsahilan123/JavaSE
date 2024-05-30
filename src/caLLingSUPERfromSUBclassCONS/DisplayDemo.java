package caLLingSUPERfromSUBclassCONS;
public class DisplayDemo extends Demo {
	public DisplayDemo() {
		super(); // Implicitly JVM will Have this
		System.out.println("DisplayDemo Defaut Constructor");
	}
	// Parameterized constructor
	public DisplayDemo(String collegeName) {
		super(collegeName); // calling super class constructor from sub class constructor
	}
}