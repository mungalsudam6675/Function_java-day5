package com.bridgelabz_functional;

import java.util.Scanner;

import com.Bridgelabz.utility.*;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a ");
		int a = scan.nextInt();
		System.out.println("enter b");
		int b = scan.nextInt();
		System.out.println("enter c");
		int c = scan.nextInt();
		int delta = Math.abs(b * b - 4 * a * c);
		double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
		double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
		System.out.println("Root of X1 = "+x1);
		System.out.println("Root of X2 = "+x2);

	}

}
