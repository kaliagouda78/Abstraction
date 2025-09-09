package com.kalia.demo;
abstract class vehicle {
	protected int speed=120;
	public vehicle() {
		System.out.println("car class constructor");
	}
	public void getvehicleDetail() {
		System.out.println("vehicle has four wheek and black colour");
	}
	
}
class Car extends vehicle{
	public void getvehicleDetail() {
		System.out.println("car has four wheek and black colour");
	}
}
public class AbtractDemo3 {
    
	public static void main(String[] args) {
		 vehicle gadi=new Car();
		 gadi.getvehicleDetail();

	}

}
