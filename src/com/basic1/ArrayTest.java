package com.basic1;


public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="127";
		String b=a;
		
		System.out.println(a.matches(b));
		
		System.out.println(a.equals(b));
		
		int[] arr= {1,2,5,8,3,1,7,5,2,5};
		
		int l=arr.length;
		
		int temp=9;
		
		for(int i=0;i<=l;i++) {
			for(int j=0;j<=l;j++) {
				
				if(arr[i]+arr[j]==temp) {
					System.out.println("The sum of" + arr[i] +" " +arr[j] + "is 9");
				}
				else {
					System.out.println("The sum is not equals to 9");
				}
			}
		}
		

	}

}
