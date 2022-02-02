package com.bridgelabz_functional;

import java.util.Scanner;

import com.Bridgelabz.utility.Utility;

public class Array2D {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int row,column;
		System.out.println("Enter Row and Column value");
		row=scan.nextInt();
		column=scan.nextInt();
		int [][]a=new int [row][column];
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++)
			{
				System.out.println("Enter row "+i+" Value and "+j+" Column value");
				a[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++)
			{
				System.out.print("   "+a[i][j]);
//				a[i][j]=scan.nextInt();
			}
			System.out.println("\n");
		}
	}

}
