package tex_management;

public class PhysicalProduct extends Product {
 private double shippingWeight;
 private double finalPrice;
 
	protected PhysicalProduct(String name, double price, String catagory, double shippingWeight) {
	super(name, price, catagory);
	this.shippingWeight = shippingWeight;
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
		
		return finalPrice*0.08;
	}
public double calculateShippingCost() {
	return shippingWeight*5;
}

@Override
public String toString() {
	return super.toString()+"\nshippingWeight :" + shippingWeight +  "";
}
	
	

}
