package com.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Container<Double> con=new Container<>();
		con.value=10.0;
		
		con.show();
		
		ArrayList<Integer> ls=new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		
		Iterator<Integer> it=ls.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Integer i:ls) {
			System.out.println(i);
		}

	}

}
