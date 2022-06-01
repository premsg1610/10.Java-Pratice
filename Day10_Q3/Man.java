package com.Day10_Q3;

public class Man implements Human_Intr {

	@Override
	public void sleep() {
		System.out.println("Man is sleeping...");
		
	}

	@Override
	public void eat() {
		System.out.println("Man is eating");
		
	}
	
	public static void main(String[] args) {
		
		Human_Intr h1 = new Man();
		h1.sleep();
		h1.eat();
	}

}
