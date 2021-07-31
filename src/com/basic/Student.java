package com.basic;

//this: to refer current class instance variable
public class Student {
	
	private int rollno;
	private String name;
	private float fee;
	
	//if local variables are different than instance variables then no need to use this keyword
	//if both are same then we need to use this keyword
	public Student(int rollno, String name, float fee) {
		// TODO Auto-generated constructor stub
		
		//Instance variables=local variables(if same by name, this keyword is used)
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		
	}

	public void display() {
		System.out.println(rollno+" "+ name+" " + fee);
	}

}
