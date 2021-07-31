package com.basic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result=new Calculate() {

			@Override
			int multiply(int a, int b) {
				// TODO Auto-generated method stub
				return a*b;
			}
			
		}.multiply(12, 32);
		
		System.out.println("result = "+result);
		
	}

}
