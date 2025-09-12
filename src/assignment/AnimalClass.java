package assignment;

import java.util.Scanner;

public class AnimalClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Animal Type");
		int choice=Integer.parseInt(sc.nextLine());
		Animal animal=switch (choice) {
		case 1->new lion();
		case 2->new Dog();
		default -> throw new IllegalArgumentException("Unexpected value: " + choice);
		};
		getAnimal(animal);
	}
	public static void getAnimal(Animal animal) {
		if(animal instanceof lion) {
			animal.roam();
			((lion) animal).roar();
		}
		else if(animal instanceof Dog dog){
			dog.roam();
			dog.bark();
			
		}
	}

}
