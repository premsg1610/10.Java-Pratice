package com.Day10_Q3;

public abstract class Animal {

	
	public abstract void eat();   // abstract method
	
	public void sleep() {                                // concrete method
		System.out.println("Animal is sleeping...");
	}
	
}


// Abstract class:

/*
 * when we want to restrict user to create object of that particular class we make that
 * class as an abstract class.
 * 
 * An abstract class -> is partial implemented structure 
 * 
 * i.e it may or may not have any abstract method.
 * 
 * An abstract class can have:
 * 1. abstract methods
 * 2. concrete methods and variables.
 * 3. empty class -> it is also an valid abstract class
 * 
 * 
 * we get partial abstraction using abstract class (0 to 100%).
 * 
 * whatever we can do for a concrete class we can do for an abstract class but only two 
 * differences are there:
 * 
 * 1. we can create object of concrete class any time but we can't create object of an 
 * abstract class.
 * 
 * 2. concrete class doesn't have any abstract method but abstract class may or may not 
 * have an abstract method in it.
 * 
 * 
 * An abstract class doesn't have any meaning until any class extends it.
 * 
 * Any child class which extends it, will override all the abstract methods inside it.
 * this child class can have its own specific method also.
 * 
 * overriding the abstract method of Animal class i.e. providing body to the method
 * (can be empty body also).
 * 
 * we have two options either over ride the abstract methods or make the class abstract.
 * 
 * if we make this child class abstract then its child class will extend and override all 
 * the methods.
 * 
 * 
 * for an abstract class reference variable, we have two possible values:
 * 
 * 1. null                       // Abs a = null ;
 * 2. its child class object.    // Abs a = new AbsChild();
 * 
 * we can't assign same class object , it will give compile time error because we can't
 * create object of abstract class.
 * 
 * Abstraction means to hide the implementation.
 * 
 * here we are hiding the implementation.
 * we are making a class as abstract and inside it we are creating an abstract method
 *(method without body).
 *
 * every time a child will extend it will override that method on its own way.
 * 
 *                      
*/
