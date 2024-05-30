package caLLingSUPERfromSUBclassCONS;

public class Demo {
	public String collegeName;

	// Non-Paratermeterized Constructor
	public Demo() {
		System.out.println("Demo Class Default constructor!!!!");
	}

	// Parameterized Constructor
	public Demo(String collegeName) {
		this.collegeName = collegeName;
	}
}