package cake_celebration;

import java.util.Scanner;

public class CakeOrder {

	public static void main(String[] args) {
	  Scanner sc=new Scanner (System.in);
	  System.out.println("Enter  cake Shape :");
	  String Shape=sc.nextLine();
	  System.out.println("Enter cake flavour :");
	  String flavour=sc.nextLine();
	  System.out.println("enter cake quentity");
	  int quantity=Integer.parseInt(sc.nextLine());
	  System.out.println("enter your massage");
	  String massage=sc.nextLine();
	  
	  OrderedCake order=new OrderedCake();
		System.out.println(order);
		OrderedCake order1=new OrderedCake(Shape, flavour, quantity);
		System.out.println(order1);
		OrderedCake order2 =new OrderedCake(Shape, flavour, quantity, massage);
		System.out.println(order2);

	}

}
