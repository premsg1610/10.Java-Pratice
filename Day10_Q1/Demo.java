package com.Day10_Q1;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		
		if(amount > 1000)
		{
			return new TajHotel();
		}
		else if(amount > 200 && amount < 1000)
		{
			return new RoadSideHotel();
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount");
		int amount = input.nextInt();
		
		input.close();
		
		
		Demo d1 = new Demo();
		
		Hotel h = d1.provideFood(amount);
		
		if(h != null)
		{
			if(h instanceof TajHotel)
			{
				h.chickenBiryani();
				h.masalaDosa();
				
				TajHotel th = (TajHotel)h;
				th.welcomeDrink();
			}
			else if(h instanceof RoadSideHotel){
				
				h.chickenBiryani();
				h.masalaDosa();
			}
		}
		else {
			System.out.println("Enter a valid amount...");
		}
	}
}
