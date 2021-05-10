package Exercise4_5;

import java.text.DecimalFormat;

public class Apple extends Fruit {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	protected double price;//p 
	protected int quantity;//q
	
	public Apple(String name, double p,int q) { //constructor with 3 arguments
		super(name); 
		this.price = p;	
		this.quantity = q; 	
	   
		if (this.quantity < 8) {
				totalPrice(); //overloading with no arguments 
				System.out.println(name);
				System.out.println("Price per pcs\t: RM "+ price);
				System.out.println("Quantity\t: " + quantity + " pcs");
				System.out.println("If quantity LESS than 8, Total price: RM " + df2.format(totalPrice()));
			}
		   
		else if (this.quantity > 8 && this.quantity < 50) {
				double pp = 15.00; //new Price
				totalPrice(pp); //overloading with 1 argument
				System.out.println(name);
				System.out.println("Price per pcs\t: RM "+ pp);
				System.out.println("Quantity\t: " + quantity + " pcs");
				
				System.out.println("If quantity MORE than 8, Total price(after discount): RM " + df2.format(totalPrice(pp)));
				System.out.println("You can get FREE Shipping!!!");
			}
				
		else {
				double pp = 10.00; //if user buy more than 50, the price will be 10.00
				double d = 0.15; //discount get (15%)
				totalPrice(pp,d); //overloading with 2 arguments
				System.out.println(name);
				System.out.println("Price per pcs\t: RM "+ pp);
				System.out.println("Quantity\t: " + quantity + " pcs");
				System.out.println("You can get discount about " + d + " %!");
				System.out.println("If quantity MORE than 50, Total price(after discount): RM " + df2.format(totalPrice(pp,d)));
				System.out.println("You can get FREE Shipping and earn up to 50 Shoppee Coin and also 15% Cashback!!!");
			} 	
		
	}
	
	public double totalPrice() { //overloading with no argument
		return this.price * this.quantity;
	}

	public double totalPrice(double pp) { //overloading with 1 argument
		Discount dis = new AppleDiscount();
		System.out.println("You can get discount about " + dis.rateOfDiscount() + " %!");
		return pp * this.quantity* (1-dis.rateOfDiscount());
	}

	public double totalPrice(double pp, double d) { //overloading with 2 arguments
		return pp * this.quantity * (1-d) ;
	}
    
	public String toString() { //overriding method
		return "\nThe " + name + " is 100% PURE!";
	}
	
}// end for class Apple extends
