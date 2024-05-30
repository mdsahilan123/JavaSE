package enCapsulation;

public class Comman {
    private int length;
    private int width;
    private int hight;
    public void setBoxDimension(int l,int b,int h)
    {
    	if(1>=1 &&b>1&& h>=1)
    	{
    	System.out.println(" Box crated with Dimension "+ l+" "+b+"  " +h);
    	}
    	else {
    		System.out.println("Invalid Dimension");
    	}
    }
    public int setlength(int l) {
    	if (l>=1) {
    		length =l;
    	}else
    		System.out.println("Invalid length");
    	length=l;
    	return length;
    }
    public int setWidth(int w) {
    	width=w;
    	return width;
    }
    public int setHight(int h) {
    	hight=h;
    	return hight;
    }
    public int gethight(int h) {
    	hight=h;
    	return hight;
    }
    public int getlength(int l) {
    	length=l;
    	return length;
    }
    public int getwidth(int w) {
    	width=w;
    	return width;
    }
}
