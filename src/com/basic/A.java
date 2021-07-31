package com.basic;

public class A {
	
	public void m() {
		System.out.println("Method M");
	}

	public void n() {
		System.out.println("Method N");
		m();
		
	}
	
	A(){
		this(5);
		System.out.println("Default");
		System.out.println(this);
	}
	
	A(int x){
		//this();
		System.out.println(x);
	}
	
	
}
