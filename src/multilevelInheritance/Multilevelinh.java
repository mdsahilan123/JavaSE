package multilevelInheritance;

class Grandfather {  
	int grandfatherbankbalance = 3000;
	public int grandFbak() {
		return grandfatherbankbalance;
	}
}

class fatherr extends Grandfather {
	int fatherbank_bal = 2000;
	public void Fatherbank() {
		System.out.println("Father's bank_balance::" + fatherbank_bal);
	}
}

class sonn extends fatherr {
	int sonbank_bal = 1000 + fatherbank_bal;
	public void sonbank() {
		System.out.println("son bank balance " + sonbank_bal);
	} 
}

public class Multilevelinh {
     public static void main(String args[]) {
    	 sonn n=new sonn();
    	System.out.println("grand father bank balance=="+n.grandfatherbankbalance);
    	 n.sonbank();
    	 n.Fatherbank();
    	 n.grandFbak();
     }
}
