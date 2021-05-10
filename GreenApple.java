package Exercise4_5;

public class GreenApple extends Apple { //sub class of Apple
	private String taste;//t
	private double pHValue;//pH
	
	public GreenApple(String name, double p,int q, String t, double pH) { //constructor for sub class with 5 arguments
		super(name,p,q);
		this.taste = t;	
		this.pHValue = pH;	
	}	

	public String getTaste() {
		return this.taste;
	}
	
	public double getpHValue() {
		return this.pHValue;
	 }		
	
	public String toString() {//overriding method
		return "\nTaste\t: "+ getTaste()
			+ "\npH Value: "+ getpHValue()
			+ super.toString() ;			
	}
	
} // end for class GreenApple extends

