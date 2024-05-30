package sIngleINheritance;

public class SingleInheritanceClient {

	public static void main(String[] args) {
		//Creating the object of Basic watch class
		//parent class         child class
           Watch bw=  new BasicWatch();
		//calling parent class method using child class object
		bw.settimeForWatch(9, 12, 30);
		//calling child class method using child class object
		 ((BasicWatch) bw).setdateforWatch(3,4,2023);
		//Display the values of time and date
		bw.displayTimeforWAtch();
		((BasicWatch) bw).displaydateforwatch();
		System.out.println("supergrand parant"+bw.hashCode());
		
	}

}
