package com.generics;

public class Container<T extends Number> {

	T value;
		
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void show() {
		
		System.out.println(value.getClass().getName());
		
	}
	
}
