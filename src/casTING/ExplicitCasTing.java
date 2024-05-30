package casTING;

/* 1.Narrowing(explicit)
 * >> Converting value from higher data type to lower data type
  >>it will not done by compiler automatically programmer need to perform  type casting
  explicitly.
 >> There is a chance of loosing the data  
 */
public class ExplicitCasTing {
	public static void main(String[] args) {
    int a=40000;
    System.out.println("a ="+a);
    short sh=(short)a;
    System.out.println("sh="+sh);
    
	}
}
