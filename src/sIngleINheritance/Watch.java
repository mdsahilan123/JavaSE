package sIngleINheritance;
//This is generalized class for defining the functionality

public class Watch {
  //Defining fields
	private int hours;
	private int minuts;
	private int seconds;
	//public non-parameterized constructor
	public  Watch() {
		System.out.println("watch class public non-parametrized constructor");	
	}
	//Business method for setting the time
	public void settimeForWatch(int hours,int minutes,int seconds) {
		  this.hours=hours;
		  this.minuts=minuts;
		  this.seconds=seconds;
	}
       //Business method for displaying the time information
    public void displayTimeforWAtch() {
    	
    	System.out.println("current time " + hours+" :"+minuts +" :" +seconds);
    }
	}

