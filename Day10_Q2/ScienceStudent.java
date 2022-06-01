package com.Day10_Q2;

public class ScienceStudent extends Student {

	double physicsMarks;
	double chemistryMarks;
	double mathsMarks;
	
	
	@Override
	public double getPercentage() {
		
		double totalMarksFraction = (physicsMarks + chemistryMarks + mathsMarks) / 300 ;
		
		double percentage = totalMarksFraction * 100 ;
		
		return percentage;
		
	}
	
	
	public ScienceStudent(String name, String address,double physicsMarks, double chemistryMarks, double mathsMarks) {
		super(name, address);
		
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
		
	}

	

	
}
