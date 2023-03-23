package com.bridgelabz.logicalprograms;

public class FibonacciSeries {
	static void fibonacci(int n) {
		
		int num1 = 0;
		int num2 = 1;
		int temp = 0;
		
		while (temp<n) {
			System.out.println(num1+ " ");
			//0+1=1  1+1=2
			int num3 = num1 + num2; 
			
			num1 = num2; //num=1
			num2 = num3;//num2=1
			temp = temp+1;//0+1
		}
			
	}

	public static void main(String[] args) {
		
		int n = 5;
		fibonacci(n);	

	}

}
