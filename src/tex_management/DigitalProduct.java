package tex_management;

public class DigitalProduct extends Product {
private String licenseKey;
private double finalPrice;

	protected DigitalProduct(String name, double price, String catagory, String licenseKey) {
	super(name, price, catagory);
	this.licenseKey = licenseKey;
}

	@Override
	public void applyDiscount(double percentage) {
		double Discount;
		Discount=getPrice();
		Discount=Discount*percentage/100;
		this.finalPrice=getPrice()-Discount;
		System.out.println("Discount applied :"+Discount);
		System.out.println("New Price :"+finalPrice);
}

	@Override
	public double calculateTax() {
		
		return finalPrice*0.05;
	}

	@Override
	public String toString() {
		return super.toString()+" \nlicenseKey=" + licenseKey ;
	}
	

}
