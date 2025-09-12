package assignment;

public abstract class Shape {
public abstract  double  getArea();
public abstract void printDetails();
}
class Rectangle  extends Shape{
	private double length;
	private double breadth;
	

protected Rectangle(double length, double breadth) {
		super();
		if(length<0 ||breadth<0) {
			System.err.println("length and breath can't be negetive !!!");
			System.exit(0);
		}
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		
		return length*breadth;
	}

	@Override
	public void printDetails() {
		System.out.println("Type = Rectangle\r\n"
				+ "");
		System.out.println("Length ="+length);
		System.out.println("Breadth ="+breadth);
		System.out.println("Area ="+getArea());
		
	}
	
}
class Circle extends Shape{
private double redius;
   
	protected Circle(double redius) {
	super();
	if(redius<0) {
		
			System.err.println("redius can't be negetive !!!");
			System.exit(0);
		
	}
	this.redius = redius;
}

	@Override
	public double getArea() {
		
		return  3.14*redius*redius;
	}

	@Override
	public void printDetails() {
		System.out.println("Type = Circle\r\n"
				+ "");
		System.out.println("Type ="+redius);
		System.out.println("Area ="+getArea());
		
	}
	
}
class Tringle extends Shape{
	private double base;
	private double height;
	
	protected Tringle(double base, double height) {
		super();
		if(base<0 ||height<0) {
			System.err.println("base and height can't be negetive !!!");
			System.exit(0);
		}
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		
		return 0.5*base*height;
	}

	@Override
	public void printDetails() {
		System.out.println("Type = Triangle\r\n"
				+ "");
		System.out.println("base ="+base);
		System.out.println("height ="+height);
		System.out.println("Area ="+getArea());
		
	}
	
}

