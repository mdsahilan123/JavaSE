package sUPerInheritanceR;

import java.util.Scanner;

class Test61{
public Test61(String x) {	
}
	public void show () {    //override
	System.out.println("1");
	}
}
class Apu extends Test61{
	public Apu(String x) {
		super(x);
		System.out.println(x+1);
	}
	@Override
	public void show(){ //override 
		super.show();

		System.out.println("2");
	}
}
public class Basic {
      public static void main(String args[]) {
    	  System.out.println("Enter name: ");
    	 Scanner sc=new Scanner(System.in);
    	 String st=sc.next();
    	
      Test61 obj=new Apu(st);
 	         obj.show(); 
      }
}
