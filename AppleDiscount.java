package Exercise4_5;

//abstract class implements interface

class AppleDiscount implements Discount{
	public float rateOfDiscount() {
		return 0.08f;
	}
}//end class AppleDiscount

class RedAppleDiscount implements Discount{
	public float rateOfDiscount() {
		return 0.08f;
	}
}//end class RedAppleDiscount
	
class GreenAppleDiscount implements Discount{
	public float rateOfDiscount() {
		return 0.08f;
	 }
}//end class GreenAppleDiscount

class MangoDiscount implements Discount{
	public float rateOfDiscount() {
		return 0.10f;
	}
} //end class MangoDiscount
	
class BlueberryDiscount implements Discount{
	public float rateOfDiscount() {
		return 0.15f;
	}
}//end class BlueberryDiscount
