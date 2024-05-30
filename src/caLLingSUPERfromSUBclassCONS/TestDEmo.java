package caLLingSUPERfromSUBclassCONS;

public class TestDEmo {
	public static void main(String[] args) {
		DisplayDemo dd = new DisplayDemo("Ashok IT"); // passing message to subclass constructor.
		System.out.println("College Name :::" + dd.collegeName); // Accessing super class field using sub class object
	}

}
