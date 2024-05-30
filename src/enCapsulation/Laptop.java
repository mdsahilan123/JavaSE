package enCapsulation;
public class Laptop {
   private String brandname;
   private float cost;
   
   public void setBrandname(String brandname) {
	   this.brandname=brandname;
   }
   public void setcost(float cost) {
	   this.cost=cost;
   }
   public String getbrandname() {
	   return this.brandname;
   }
   public float getcost() {
	   return this.cost;
   }
}
