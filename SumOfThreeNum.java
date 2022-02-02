package com.bridgelabz_functional;

import com.Bridgelabz.utility.Utility;

import java.util.Scanner;

public class SumOfThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Size of Array :");
		int size=scan.nextInt();
		int arr[]=new int [size];//create array & read values one by one

		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Value :");
			arr[i]=scan.nextInt();
		}

		int sum=Utility.findDistinctTriplets(arr,size);
		System.out.println("No.of Tripltes having sum zero is:"+sum);
		System.out.println();
		scan.close();

	}

}
