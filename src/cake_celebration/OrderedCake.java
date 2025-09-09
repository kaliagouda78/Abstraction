package cake_celebration;

public class OrderedCake extends Cake {
private String massage;

public OrderedCake(String shape, String flavour, int quantity, String massage) {
	super(shape, flavour, quantity);
	this.massage = massage;
}

public OrderedCake(String shape, String flavour, int quantity) {
	super(shape, flavour, quantity);
}

public OrderedCake() {
	super("round", "Vanila ", 1);

}

@Override
public String toString() {
	if(massage!=null) {
		return getShape()+getFlavour()+"cake of"+getQuantity()+"is ready with Happy Birthday "+massage+" @ rs ."+getQuantity()*price;
	}
	else return super.toString();
	
	
}


}
