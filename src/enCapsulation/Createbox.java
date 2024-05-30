package enCapsulation;

public class Createbox {
	public static void main(String[] args) {
     Comman cn =new Comman();
     //int h=cn.hight=0;
     //int l=cn.length=-10;
     //int b=cn.width=0;
     int w=cn.setWidth(20);
     int l=cn.setlength(15);
     int h=cn.setHight(30);
     cn.setBoxDimension(w,l, h); 
     System.out.println(cn.gethight(h));
	}

}
