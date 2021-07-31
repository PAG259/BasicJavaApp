package com.basic;

public class ABC {

	public static ABC obj;
	
	private ABC() {
		System.out.println("Instance Created");
	}
	
	public static synchronized ABC getInstance() {//by default it is Eager Instantiation
		
		if(obj==null) {
			
		obj=new ABC();
		
		}
		
		return obj;
		
	}
	
}
