package com.kalia.demo;
abstract class Animal{
	public abstract void checkup();
	}
class Lion extends Animal{
	@Override
	public void checkup() {
		System.out.println("lion chekup");
		}
	}
class Tiger extends Animal{
	@Override
	public void checkup() {
		System.out.println("Tiger chekup");
		}
	}
class Elephant extends Animal{
	@Override
	public void checkup() {
		System.out.println("Elephant chekup");
		}
	}
class Fox extends Animal{
	@Override
	public void checkup() {
		System.out.println("Fox chekup");
		}
	}
public class AbstractClDemo3 {

	public static void main(String[] args) {
//		Animal animal=new Lion();
//		animal.checkup();
		Animal animal[]={new Lion(),new Lion()};
		passValue(animal);
	}
	public static void passValue(Animal animal[]) {
		for(Animal a:animal) {
			a.checkup();
		}
	}

}
