package hierarchicalINheriTANCE;

public class Developer extends Person {
public String domain;
public float experience;
public String salary;
public Developer() {
	System.out.println("Developer class public constructor");
}
public Developer(String domain, String salary,float experience) {
	super();
	this.domain = domain;
	this.salary = salary;
	this.experience=experience;
}
public void displayDeveloperInformation() {
	 System.out.println("*****Trainer information*******");
	 System.out.println("Developer Domain::"+ domain +" Developer salary "+salary  +"Developer experience "+experience);
	 


}}
