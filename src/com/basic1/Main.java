package com.basic1;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		Vehicle v=new Car();
		v.run();
		
		A b=new A();
		b.name();
		
		B a=new B();
		a.name();
		
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("Parth");
		
		Employee e2=new Employee();
		e2.setId(2);
		e2.setName("Vaibhav");
		
		ArrayList<Employee> ar=new ArrayList<Employee>();
		
		ar.add(e1);
		ar.add(e2);
		
		//ar.ensureCapacity(10);
		System.out.println(ar);
		
		System.out.println(ar);
		
		
		HashMap<Integer, String> m=new HashMap<Integer, String>();
		m.put(1, "Vaibhav");
		m.put(2, "Parth");
		
		for(Entry<Employee, Employee> mp: m.entrySet()) {
			System.out.println("Key = " + mp.getKey() + ", Value = " + mp.getValue());
		}
		
		m.forEach((K,V)->System.out.println(K+" "+V));*/
	
		String str="asbfjsbfbvjsdbdkfsdjkgsbvjsdbjsdfhifhkfhsdjfsdbgsdjghdsjghsdgjkhsdgjhsgh";
		charCount(str);
		
	}

	private static void charCount(String str) {
		// TODO Auto-generated method stub
		
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		
		char[] cr=str.toCharArray();
		
		System.out.println(cr);
		
		for(char c: cr) {
			
			if(mp.containsKey(c)) {
				mp.put(c, mp.get(c)+1);
			}
			
			else {
				mp.put(c, 1);
			}
			
		}
		
		for(Map.Entry<Character, Integer> ent: mp.entrySet()) {
			System.out.println(ent.getKey() + " " + ent.getValue());
		}
		
	}

}
