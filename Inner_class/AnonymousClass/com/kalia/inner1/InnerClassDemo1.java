package com.kalia.inner1;
abstract class Bird{
	public abstract void roam();
}
public class InnerClassDemo1 {

	public static void main(String[] args) {
		Bird parrot=new Bird() {
			@Override
			public void roam() {
				System.out.println("parrot bird is running :");
			}
		};
		Bird sparrow =new Bird() {
		@Override
		public void roam() {
			System.out.println("parrot bird is running :");
		}
		};
       parrot.roam();
       sparrow.roam();
	}

}
