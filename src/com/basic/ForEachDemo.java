package com.basic;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		List<Integer> values=Arrays.asList(1,2,4,5,3,8,9,7);

		System.out.println(values);	
	
		values.forEach(i-> System.out.println(i));
		}
		
		//Multiple child exceptions can be called in one single catch block.
		catch (ArrayIndexOutOfBoundsException|ArithmeticException|ClassCastException e) {
			// TODO: handle exception
		}
		
		
		
	}

}
