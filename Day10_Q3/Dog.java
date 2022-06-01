package com.Day10_Q3;

public class Dog extends Animal {

	
	@Override
	public void eat() {
		
		System.out.println("Dog is eating...");
		
	}
	
	public static void main(String[] args) {
		
		Animal a1 = new Dog();
		a1.sleep();
		a1.eat();
	}

}
