package com.kalia.demo;
abstract class ATM{
	abstract public void withdraw(double amount);
	abstract public void deposite(double amount);
	abstract public void PinChange();
}
class SBI extends ATM{
	public void withdraw(double amount) {
		System.out.println("Making Withdral "+amount+"through Sbi");
	}
	public void deposite(double amount) {
		System.out.println("Making deposite "+amount+"through Sbi");
	}
	public void PinChange() {
		System.out.println("success full  pin is changeded");
	}
	
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		 ATM atm=new SBI();
		 atm.deposite(476);
		 atm.withdraw(3683);
		 atm.PinChange();
	}

}
