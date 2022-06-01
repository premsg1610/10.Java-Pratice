package com.Day10_Q3;

public interface Human_Intr {

//  all methods are abstract
	
	void  sleep();      
	void  eat();
	
}


// Interface:

 /* 
 * it is like a contract, every implemented class has to follow it (override it).
 * 
 * 
 * it is a fully unimplemented structure.
 * because all methods are abstract methods (method without body)
 * (** prior to JDK 1.8).
 * 
 * form JDK 1.8 we can also have methods with body inside an interface.
 * these methods should be either default or static.
 * 
 * the purpose of creating interface is:
 * 
 * > to achieve 100% abstraction
 * > to achieve multiple inheritance.
 * 
 * 
 * as a class meant to be extended, interface meant to be implemented
 * 
 * i.e. any class implements the interface.
 * 
 * for an interface reference variable, the possible values are:
 * 
 * 1. null 
 * 2. its implemented class object i.e. the object of class which implements the interface.
 *     ex: Human_intr h1 = new Man();
 *     
 * 
 * inside an interface, if we place any abstract method then by default it is "public and
 * abstract" whether we mention or not.
 * 
 * so instead of writing: public abstract void print();
 * we can directly write: void print();
 * 
 * 
 * if any class implements the interface then it ,must override all the abstract methods
 * of interface otherwise we need to mark the implemented class as abstract.
 * 
 * since we are over riding these method in implemented class then it will be written as 
 * void print() i.e. it access modifier is default but in interface it is public
 * therefore we have to write public (otherwise it will show can not reduce visibility).
 * like :  public void print();
 *   
 * when we define any variable inside an interface, by default it will become public
 * static final whether we mention it or not.
 * 
 * with the help of inheritance also we can achieve Is-A relationship.
 * 
 * ex: Man is a type of Human_Intr.
 * 
 * An interface can have empty also and this type of interface is known as 
 * Empty/Tag/Marker interface.
 */