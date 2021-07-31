package com.basic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		Test3 t3=new Test3();
		
		//sort method is used to used to sort the list in ascending order
		ArrayList<String> ls=new ArrayList<String>();
		ls.add("Parth");
		ls.add("Vaibhav");
		ls.add("Bhavna");
		
		Collections.sort(ls);
		
		System.out.println(ls);
		
		
		@SuppressWarnings("rawtypes")
		Class cls=t3.getClass();
		System.out.println("The Name of class is: " + cls.getName());
		
		try {
			@SuppressWarnings("unchecked")
			Method m=cls.getDeclaredMethod("method");
			
			//Private Method should not be invoked, but due to use of reflection API it is called in some other class
			m.setAccessible(true);
			m.invoke(t3);
			
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
