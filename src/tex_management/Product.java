package tex_management;

public abstract  class Product {
private String name;
private double price;
private String catagory;
protected Product(String name, double price, String catagory) {
	super();
	if(price<=0) {
		System.err.println("Price cannot be negative.");
		System.exit(0);
	}
	if(name==null||name.isEmpty()||name.equals(null)) {
		System.err.println("name cannot be empty or null.");
		System.exit(0);
	}
	if(catagory==null||catagory.isEmpty()||catagory.equals(null)) {
		System.err.println("catagory cannot be empty or null.");
		System.exit(0);
	}
	this.name = name;
	this.price = price;
	this.catagory = catagory;
}
public abstract void applyDiscount(double percentage);
public abstract double calculateTax();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getCatagory() {
	return catagory;
}
public void setCatagory(String catagory) {
	this.catagory = catagory;
}
@Override
public String toString() {
	return "Product Name:" + name + "\nPrice RS:" + price + "\ncatagory :" + catagory + "";
}


}
