package com.Day10_Q2;

public class HistoryStudent extends Student {

	double historyMarks;
	double civicsMarks;
	
	
	public HistoryStudent(String name, String address,double historyMarks, double civicsMarks) {
		super(name, address);

		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	
	@Override
	public double getPercentage() {
		
		double totalMarksFraction = (historyMarks + civicsMarks)/ 200 ;
		
		double percentage = totalMarksFraction * 100 ;
		
		return percentage;
		
	}
	
	

}
