package Exercise4_5;

public class RedApple extends Apple { //sub class of Apple
	private double weight;//w
	private int nutrient;//n
	
	public RedApple(String name,double p, int q, double w, int n) { //constructor for sub class with 5 argument
		super(name,p,q);
		this.weight = w;
		this.nutrient = n;
    }

	public double getWeight() {
		return this.weight;
	 }	
	public double TotalWeight(){ 
		return this.quantity * this.weight;
	}	
	
	public int getNutrient() {
		return this.nutrient;
	 }	

	public String toString() {//overriding method
		return "\nWeight\t: "+ getWeight() + " (grams)"
			+ "\nTotal Weight\t: "+ TotalWeight() + " (grams)"
			+ "\nNutrient\t: "+ getNutrient() + " calories\n"
			+ super.toString();
	}
} // end for class RedApple extends 
