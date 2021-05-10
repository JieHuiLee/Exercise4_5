package Exercise4_5;

import java.text.DecimalFormat;

public class Blueberry extends Fruit{ //sub class of Fruit
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	private double price;//p 
	private int quantity;//q
	private int size;//s (serving size in grams)
	private int vitaminK;//vK
		
	public Blueberry() { //constructor for sub class with no argument
		super();
		this.price = 0.00;	
		this.quantity = 0; 
		this.size = 0;	
		this.vitaminK= 0;
	}
	
	public Blueberry(String name, double p, int q, int s, int vK) { //constructor for sub class with 3 argument
		super(name);
		this.price = p;	
		this.quantity = q; 
		this.size = s;	
		this.vitaminK= vK;
		
		System.out.println(name);
		
		if (this.size <= 30) {
			System.out.println("Price per pcs\t: RM "+ price);
			System.out.println("Quantity\t: " + quantity + " pcs");
			System.out.println("There are no more discount!");
			System.out.println("Total price: RM " + df2.format(totalPrice()));
			
			System.out.println("Size:" + size);
			System.out.println("We will delivery in small pack!");
			System.out.println("You can get the total Vitamin K about " + calTotalVitaminK() +" mcg."); //overloading with no arguments 
		}
		else if(this.size > 30 && this.size <= 50){
			System.out.println("Price per pcs\t: RM 26.10");
			System.out.println("Quantity\t: " + quantity + " pcs");
			System.out.println("Total price (after discount): RM " + df2.format(totalPrice(26.10)));
			
			System.out.println("Size:" + size);
			System.out.println("We will delivery in big pack!");
			System.out.println("You can get the total Vitamin K about " + calTotalVitaminK(36) +" mcg.");//overloading with 1 arguments 
		}
		else if (this.size > 50 && this.size <= 120) { //more than 50g
			//int freeVitaK = 29; (Gain the free extra small pack of VitaminK)
			
			System.out.println("Price per pcs\t: RM 29.40");
			System.out.println("Quantity\t: " + quantity + " pcs");
			System.out.println("You can get discount about 20 %!");
			System.out.println("Total price (after discount): RM " + df2.format(totalPrice(29.40,0.20)));
			
			System.out.println("Size:" + size);
			System.out.println("We will delivery in jar bottle!");
			System.out.println("You can get the total Vitamin K about " + calTotalVitaminK(29,42) +" mcg."); //overloading with 2 arguments 
			System.out.println("You can get free extra small pack!");
		}
		else //more than 120(need to buy more by this one of three type of serving size)
			System.out.println("We just have this three type of serving size! "
					+ "+/n We will prefer you to choose more quantity by this three type of serving size!");
	    
	}
	
	public double totalPrice() { //overloading with no argument
		return this.price * this.quantity;
	}

	public double totalPrice(double pp) { //overloading with 1 argument
		
		Discount dD = new BlueberryDiscount();
		System.out.println("You can get discount about " + dD.rateOfDiscount() + "%!"); //15%
		return pp * this.quantity * (1-dD.rateOfDiscount());
	}

	public double totalPrice(double pp, double d) { //overloading with 2 arguments
		return pp * this.quantity * (1-d) ;
	}
	
	public int calTotalVitaminK() { //overloading with no argument
		return this.size * this.vitaminK;
	}
	
	public int calTotalVitaminK(int vitaK) { //overloading with 1 argument
		return this.size * vitaK;
	}
	
	public int calTotalVitaminK(int s, int vitaK) { //overloading with 2 arguments
		return s * vitaK;
	}	
	
	public String printUses() {
		return "\nThe expiry date that can uses is between 1 to 3 months.";
	}	
	
	public String toString() {//overriding method
		return printUses() ;
	}
}// end for class Blueberry extends
