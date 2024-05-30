package hierarchicalINheriTANCE;

public class Trainer extends Person {
   public int trainerID;
   public String Domain;
   public float experience;
   //DEfining the constructor
   public Trainer() {
    System.out.println("Public Constructor for trainer class");
}
public Trainer(int trainerID, String domain, float experience) {
	this.trainerID = trainerID;
	this.Domain = domain;
	this.experience = experience;
}
public void displayTrainer() {
	 System.out.println("*****Trainer information*******");
	 System.out.println("Trainer ID ::"+ trainerID +"Trainer Domain  "+Domain  +"Trainer experience "+experience);
	 
}
   
}
