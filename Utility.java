package com.Bridgelabz.utility;

public class Utility {

	//find harmonic of number..

	public static double harmonicValue(double n)
	{
		// compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double val = 0.0;

		for (int i = 1; i <= n; i++) 
		{
		//sum += 1.0 / i;
		val = val + (1.0/i);
		}
		return val;
	}
	
	//find quotient
	
	public static int Quotient(int num1, int num2 )
	{
		int result = num1/num2;
		return result;
	
	}
	
	//find reminder..
	
	public static int Remainder(int num1, int num2 )
	{
		int result = num1%num2;
		return result;
	
	}
	
	
	//calculate sum of three integer is zero..
	
	public static int findDistinctTriplets(int a[],int length)//method 1
	{
		int count=0;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				for(int k=j+1;k<length;k++)
				{
					
					if (a[i] + a[j] + a[k] == 0)
					{
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
						count++;
					}
				}
			}
		}
		
		return count;
	}
	
	//find Euclidean distance using math.power function..
	
//	public static int calculate(int x, int y)
//	{
////		double distance = Math.pow((x*x+y*y),0.5);
////		//dist=(int) distance;
////		// distance;
//		System.out.println("distance is " + Math.pow((x * x + y * y), 0.5))
//	}
//	

	
}





















