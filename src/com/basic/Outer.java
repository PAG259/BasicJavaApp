package com.basic;

//Inner Class are of 3 types:
//Member Inner class
//Static Inner class
//Anonymous Inner class
public class Outer {
	
	static int a;
	
	public void show() {
		System.out.println("In Show");
	}

	static class Inner{
		
		public void display() {
			System.out.println("In Display");
		}
		
	}
	
	
}
