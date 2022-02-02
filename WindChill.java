package com.bridgelabz_functional;

import com.Bridgelabz.utility.Utility;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter temperature in fahrenheit");
	    double t = scan.nextDouble();
	    System.out.println("enter wind speed in miles per hour");
	    double v = scan.nextDouble();
	    if (Math.abs(t) > 50 || v > 120 || v < 3) {
	        System.out.println("enter correct input");
	    }
	    else {
	        double w = 35.74 + 0.62158 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
	        System.out.println("Wind chill "+w);
	    }

	}

}
