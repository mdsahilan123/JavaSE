package sIngleINheritance;
 //This is a specialized class for basic watch functionality
public class BasicWatch extends Watch {
 //Defining the fields
	public int day;
	public int month;
	public int year;
	//public non-parameterized constructor
		public  BasicWatch() {
			System.out.println("watch class public non-parametrized constructor");	
		}
		//Business method for setting the time
		public void setdateforWatch(int day,int months,int year) {
			  this.day=day;
			  this.month=months;
			  this.year=year;
		}
	       //Business method for displaying the time information
	    public void displaydateforwatch() {
	    	
	    	System.out.println("current time " + day+" "+month +" " +year);
	    }
		}
   

