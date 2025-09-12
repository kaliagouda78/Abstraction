package assignment;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter your choice \n 1.tringle \n2.Circle \n3.Tringle");
		int choice=Integer.parseInt(sc.nextLine());
		Shape a=null;
		switch(choice) {
		case 1->{
			System.out.print("enter the value of length :");
			double l=Double.parseDouble(sc.nextLine());
			System.out.print("enter the value of breath :");
			double b=Double.parseDouble(sc.nextLine());
			a=new Rectangle(l, b);
			a.printDetails();
		}
		case 2->{
			System.out.print("enter the value of length :");
			double redius=Double.parseDouble(sc.nextLine());
			a=new Circle(redius);
			a.printDetails();
		}
		case 3->{
			System.out.print("enter the value of base :");
			double base=Double.parseDouble(sc.nextLine());
			System.out.print("enter the value of height :");
			double height=Double.parseDouble(sc.nextLine());
			a=new Tringle(base, height);
			a.printDetails();
		}
		
		}
		sc.close();
		}

	}


