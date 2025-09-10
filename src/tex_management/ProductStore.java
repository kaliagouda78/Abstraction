package tex_management;

import java.util.Scanner;

public class ProductStore {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Product Type:\r\n"
				+ "1. Digital Product\r\n"
				+ "2. Physical Product\r\n"
				+ "");
	int choice=sc.nextInt();
	sc.nextLine();
	switch(choice) {
	case 1->{
		System.out.print("Enter Digital Product Name :");
		String name=sc.nextLine();
		System.out.print("Enter Product Price :");
		double price=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Product Category :");
		String catagory=sc.nextLine();
		System.out.print("Enter Product License Key :");
		String licenseKey=sc.nextLine();
		System.out.print("Enter the discount % on final bill :");
		double discount=Double.parseDouble(sc.next());
		Product p=new DigitalProduct(name, price, catagory, licenseKey);
		System.out.println(p);
		p.applyDiscount(discount);
		System.out.println("tax :"+p.calculateTax());
	}
	case 2->{
		System.out.print("Enter Physical Product Name :");
		String name=sc.nextLine();
		System.out.print("Enter Physical Price :");

		double price=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Physical Category :");
		String catagory=sc.nextLine();
		System.out.print("Enter  Product weight : :");
		int wieght=Integer.parseInt(sc.next());
		System.out.print("Enter the discount % on final bill :");
		double discount=Double.parseDouble(sc.next());
		Product m=new PhysicalProduct(name, price, catagory, wieght);
		System.out.println(m);
		m.applyDiscount(discount);
		System.out.println("tax :"+m.calculateTax());
		System.out.println("Shipping Cost RS :"+((PhysicalProduct) m).calculateShippingCost());
	}
	}

	}

}
