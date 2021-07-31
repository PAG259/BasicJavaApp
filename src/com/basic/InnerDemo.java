package com.basic;

import com.basic.Outer.Inner;

public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="abc";
		String b=new String("Parth");
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

		Inner obj=new Inner();
		obj.display();
		
		/*Outer obj=new Outer();
		
		Outer.Inner obj1=obj.new Inner();
		obj1.display();*/
		
	}

}
