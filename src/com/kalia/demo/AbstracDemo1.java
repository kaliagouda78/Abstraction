package com.kalia.demo;
abstract class Shape{
	public abstract void draw();
}
class Ractangle extends Shape{
	public void draw() {
		System.out.println("Rectangle draw ");
	}
}
class Square extends Shape{
	public void draw() {
		System.out.println("Square draw");
	}
}
public class AbstracDemo1 {

	public static void main(String[] args) {
	Shape shape=null;
	shape=new Ractangle();
	shape.draw();
	shape=new Square();
	shape.draw();
	}

}
