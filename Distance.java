package com.bridgelabz_functional;

import java.util.Scanner;

import com.Bridgelabz.utility.Utility;


public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter value for x");
		int x = scan.nextInt();
		System.out.println("enter value for y ");
		int y = scan.nextInt();
//		double distance=Utility.calculate(x, y);
//		System.out.println("Distance = "+distance);
		System.out.println("distance is " + Math.pow((x * x + y * y),0.5));

	}

}
