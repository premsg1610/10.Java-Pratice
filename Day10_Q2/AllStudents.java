package com.Day10_Q2;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter science student name:");
		String name = input.nextLine();
		
		System.out.println("Enter student address:");
		String address = input.nextLine();
		
		System.out.println("Enter physics marks:");
		double physicsMarks = input.nextDouble();
		
		System.out.println("Enter chemistry marks:");
		double chemistryMarks = input.nextDouble();
		
		System.out.println("Enter maths marks:");
		double mathsMarks = input.nextDouble();
		
		
		ScienceStudent s1 = new ScienceStudent(name,address,physicsMarks,chemistryMarks,mathsMarks);
		double percentage = s1.getPercentage();
		
		
		input.nextLine();
		System.out.println("Enter history student name:");
		String name2 = input.nextLine();
		
		
		System.out.println("Enter student address:");
		String address2 = input.nextLine();
		
		System.out.println("Enter history marks:");
		double historyMarks = input.nextDouble();
		
		System.out.println("Enter civics marks:");
		double civicsMarks = input.nextDouble();
		
		input.close();
		
		HistoryStudent h1 = new HistoryStudent(name2,address2,historyMarks,civicsMarks);
		double percentage2 = h1.getPercentage();
		
		
		System.out.println("*****************************");
		
		System.out.println("Student name is: " + s1.name);
		System.out.println("Student address is: " + s1.address);
		System.out.println("Percentage of marks of science student " +  s1.name + " is: " + percentage + "%");
		
		System.out.println("=============================");
		
		System.out.println("Student name is: " + h1.name);
		System.out.println("Student address is: " + h1.address);
		System.out.println("Percentage of marks of history student " +  h1.name + " is: " + percentage2 + "%");
		
		System.out.println("*****************************");
	}
}
