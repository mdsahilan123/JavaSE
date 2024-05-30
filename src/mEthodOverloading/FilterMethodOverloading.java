package mEthodOverloading;

public class FilterMethodOverloading {
	// as per application requirement
	public String getproductdetails(String brandname) {
		System.out.println("Getting the product details based on the Brandname");
		return brandname;
	}

	public void getproductdetails(String[] brandname) {
		System.out.println("Getting product details based on multiple brand names");
	}

	public void getproductdetails(int minPrice, int maxPrice) {
		System.out.println("getting the product details min and max price..");
	}

	public void getproductdetails(float minPrice, float maxPrice) {
		System.out.println("getting the product details based in min and max price of float");

	}

	public void getproductdetails(double minprice, double maxprice) {
		System.out.println("getting the product details based in min and max price of double");
	}

	public static void getproductdetails(String brandname, int price) {
		System.out.println("static method overloading");
	}

	public static void getproductdetails(int price, String brandname) {
		System.out.println("static method overloading 1...");
	}
}
