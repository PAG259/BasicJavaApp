package com.generics;

//Constructor class is declared as final
public class A extends B {
	
	A(){
		super();
		System.out.println("In A");
		
	}
	
	
	public A(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("In int A");
	}


	public void run() {
		System.out.println("Class A");
	}
	
	//Constructor cannot be inherited or overriding, so there is no chance of modification
	//and hence constructor is internally final
	//Private Constructor can be used for Singleton class pattern
	//Difference between static and final?
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*B b=new B();
		System.out.println(b);
		
		A a=new A();
		System.out.println(a);
		*/
	}

}
