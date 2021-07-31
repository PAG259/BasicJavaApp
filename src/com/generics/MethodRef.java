package com.generics;

import java.util.Arrays;
import java.util.List;

public class MethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ls=Arrays.asList("Parth","Akshay","Kaushal","Vaibhav");
		
		//Lambda Expression using call by value
		//ls.forEach(t -> System.out.println(t));
		
		//Method Reference
		ls.forEach(System.out::println);
		
	}

}
