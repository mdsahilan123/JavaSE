package mEthodOverloading;
public class MethodoverloadingClient {
	public static void main(String[] args) {
		FilterMethodOverloading fm = new FilterMethodOverloading();
		// calling method overloading method based on different parameters
		fm.getproductdetails("Samsung");
		fm.getproductdetails(new String[] { "samsung", "redmi", "Nokia" });
		fm.getproductdetails(1000.0f, 15000.0f);
		fm.getproductdetails(25000, 35000);
		fm.getproductdetails(8500.256, 9500.58);
		// calling the static method overloaded methods
		FilterMethodOverloading.getproductdetails(1000, "samsung");
		FilterMethodOverloading.getproductdetails("OPPO", 15000);
		MethodoverloadingClient.main("mahesh");
	}
	// overloading the main method
	public static void main(String args) {
		System.out.println("main method got overloaded....." + args);
	}
}
