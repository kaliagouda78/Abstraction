package assignment;

public abstract class Animal {
public abstract void roam();
}
class lion extends Animal{

	@Override
	public void roam() {
		System.out.println("Lion is roaming");
		}
	public void roar() {
		System.out.println("lion is roaring ");
	}
}
class Dog extends Animal{

	@Override
	public void roam() {
		System.out.println("\"Dog is roaming\"");
		}
	public void bark() {
		System.out.println("dog is barking ");
	}
	}