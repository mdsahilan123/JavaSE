 package this2NDuseSChaning;
class Chain1{
	static String uname;
	static String collname;
	String cource;
	String stuname;
	int rollno;
public Chain1() {
	System.out.println("chain1  public class Constructors....");
	  uname="BBMKU";
}
public Chain1(String collnane) {
	this();
	System.out.println("Chain1 2nd public class constructor......");	
	Chain1.collname="KB College";	
}

public Chain1(String cource,String stuname,int rollno) {
	 this(collname);
	System.out.println("3rd  public class constructor.....");
	this.cource=cource;
	this.rollno=rollno;
	this.stuname=stuname;
	this.collname=collname;
}
public void dispaly() {
	  System.out.println("uname = "+uname);
	  System.out.println("collname = "+collname);
	  System.out.println("cource = "+cource);
	  System.out.println("rollno = "+rollno);
	  System.out.println("student name = "+stuname);  
	  
}
}
public class Chaning {
     public static void main(String args[]) {
    	 Chain1 c1=new Chain1("Computer Science","Shail ",01);
    	 c1.dispaly();
     }
}
