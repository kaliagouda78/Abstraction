package cake_celebration;

public abstract class Cake {
private String shape;
private String flavour;
private int quantity;
public static double price = 400;
protected Cake(String shape, String flavour, int quantity) {
	super();
	this.shape = shape;
	this.flavour = flavour;
	this.quantity = quantity;
}
public String getShape() {
	return shape;
}
public void setShape(String shape) {
	this.shape = shape;
}
public String getFlavour() {
	return flavour;
}
public void setFlavour(String flavour) {
	this.flavour = flavour;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public static double getPrice() {
	return price;
}
public static void setPrice(double price) {
	Cake.price = price;
}
@Override
public String toString() {
	return "A "+shape+flavour+"cake of"+quantity+"is ready  @ rs ."+quantity*price;
}


}
