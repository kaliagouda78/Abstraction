package com.kalia.demo;
abstract class  vehicle1{
	abstract void run();
	abstract void color();
}
abstract class Car1 extends vehicle1{
	void color() {
		System.out.println("car color is balck");
	}
}
class EvCar extends Car1{
	@Override
	void run() {
		System.out.println("Ev car is running ");
		}
	
}
public class AbstractDemp5 {

	public static void main(String[] args) {
		vehicle1 v=new EvCar();
		v.run();
	}

}
