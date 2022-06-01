package com.Day10_Q4;

public class Area extends Shape {

	@Override
	public int rectangleArea(int length, int breadth) {
		int area = length * breadth;
		
		System.out.println("Area of rectangle having length " + length + " and breadth " + breadth + " is: " + area + " sq. units");
		return 0;
	}

	@Override
	public int squareArea(int side) {
		int area = side * side;
		
		System.out.println("Area of square having side " + side + " is: " + area + " sq. units");
		return 0;
	}

	@Override
	public int circleArea(int radius) {
		
		double r = radius;
		double area = (22 * r * r)/7;
		
		System.out.println("Area of circle having radius " + radius + " is: " + area + " sq. units");
		return 0;
	}
	
	

}
