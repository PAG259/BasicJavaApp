package com.basic;

public class Sum {

	public static void main(String[] args) {
		
		int num=100;
		int sum=0;
		
		int n=5;
		int fact=1;
		
		for(int j=1;j<=n;j++) {
			fact=j*fact;
		}
		
		System.out.println("Factorial of number is: "+ fact);
		
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of Natural Numbers is: "+ sum);
	}
	
	
}
