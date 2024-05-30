package cReatingString;

public class StringDemoClient {
	public static void main(String[] args) {
    //1.Defining a String as a Literal;
		String st="sahil";
	//2.Defining the object as a String
		String st1 =new String("Sahil");
	//3.Defining the Character Array For Storing into String Object;
		char[] ch= {'H','E','L','L','O',};
	    String st2=new String(ch);
	 //4.Converting byte array into String 
	    byte[] b= {98,99,90,34,95};
	    String st3=new String(b);
	    System.out.println("st====="+st);
	    System.out.println("st1====="+st1);
	    System.out.println("st2====="+st2);
	    System.out.println("st3====="+st3);
	}

}
