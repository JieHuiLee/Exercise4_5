package Exercise4_5;

public abstract class Fruit {
	//define super class as abstract class. This is because we don‘t need to create instance of fruit.
	//Class which declare as abstract cannot create instance object.
	
	protected String name; 
	
	public Fruit(){ //constructor without argument
		this.name = " ";
	}
	
	public Fruit(String name){ //constructor with 1 argument
		this.name = name;
	}
	
	public String getName() { 
		return name;
	}		
	
	public abstract String toString();
	public abstract double totalPrice();
	public abstract double totalPrice(double pp);
	public abstract double totalPrice(double pp, double d);
}// end for Fruit class
