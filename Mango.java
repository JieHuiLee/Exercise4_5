package Exercise4_5;

import java.text.DecimalFormat;

public class Mango extends Fruit { //sub class of Fruit
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	private double price;//p 
	private int quantity;//q
	private String region;//r
	private String color;//c
	private double vitaminC;//v
	
	public Mango() { //constructor for sub class without argument
		super();
		this.price = 0.00;	
		this.quantity = 0; 
		this.region = " ";
		this.color = " ";
		this.vitaminC = 0.00;
	}
	
	public Mango(String name, double p, int q,String r,String c,double v) {//constructor for sub class with 4 arguments
		super(name);		
		this.price = p;	
		this.quantity = q; 
		this.region =r;
		this.color = c;
		this.vitaminC = v;
		
		System.out.println(name);
		
		switch(region) {
			case "Taiwan":			
			System.out.println("Price per pcs\t: RM "+ price);
			System.out.println("Quantity\t: " + quantity + " pcs");
			System.out.println("There are no more discount!");	
			System.out.println("Total price: RM " + df2.format(totalPrice()));
			System.out.print(info("Taiwan","Vivid Yellow",36.4));
			break;
		case "Hawaii":
			totalPrice(21.80);
			System.out.print(info("Hawaii","Vivid Yellow", 40.2));
			
			break;
		case "California ":
			totalPrice(25.90,0.15);
			System.out.print(info("California","Vivid Yellow",45.0));
			break;
		}
	}
	
	public double totalPrice() { //overloading with no argument
		
		return this.price * this.quantity;
	}

	public double totalPrice(double pp) { //overloading with 1 argument
		System.out.println("Price per pcs\t: RM "+ pp);
		System.out.println("Quantity\t: " + quantity + " pcs");
		Discount dd = new MangoDiscount();
		System.out.println("You can get discount about" + dd.rateOfDiscount() + "%!"); //10%
		System.out.println("Total price (after discount): RM " + df2.format(totalPrice(pp)));
		return pp * this.quantity * (1-dd.rateOfDiscount());
	}

	public double totalPrice(double pp, double d) { //overloading with 2 arguments
		System.out.println("Price per pcs\t: RpM "+ pp);
		System.out.println("Quantity\t: " + quantity + " pcs");
		System.out.println("You can get discount about "+ d + " %!");
		System.out.println("Total price (after discount): RM " + df2.format(totalPrice(pp,d)));
		return pp * this.quantity * (1-d) ;
	}
	
	public String info() { //overloading with no argument
		return "\nRegion\t: " + region
			   + "\nColor\t: " + color 
			   + "\nVitaminC: " + vitaminC +"\n";
	}
	
	public String info(String r, String c) { //overloading with 2 arguments
		return "\nRegion\t: " + r 
			   + "\nColor\t: " + c
			   + "\nVitaminC: " + vitaminC +"\n";
	}
	
	public String info(String r, String c,double v) { //overloading with 3 arguments
		return "\nRegion\t: " + r 
			  + "\nColor\t: " + c 
			  + "\nVitaminC: " + v +"\n";
	}
	

	
	public String toString() {//overriding method
		return "\nFunction: Mangoes are a great effective at lowering blood pressure.\n" ;
	}

}// end for class Mango extends
