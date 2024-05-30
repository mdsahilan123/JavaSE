package casTING;

 //converting the value from lower data type to higher data type
  //will be done automatically by java compiler
  //there is no chance of loosing the data


   // byte>>short>>int>>long>>float>>double
  //Wilding i.e implicit casting
public class ImplicitCasting {
	public static void main(String[] args) {
         long lg=36987;
         System.out.println("lg==========::"+lg);
         float ft=lg;
         System.out.println("float value ::"+ft);
	}

}
