package com.basic;

public class TestThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//without this keyword values are returned as 0 and null
		Student s=new Student(1,"Parth",5000f);
		s.display();//Student class
		
		//this: to invoke current class method
		//this(): to call current class constructor
		A a=new A();
		a.n();
		
		System.out.println(a);
		
	}

}
