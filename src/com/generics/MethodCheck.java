package com.generics;

public class MethodCheck {

	/*
	 * public int addCheck(int x, int y) {
	 * 
	 * //int z; int z=0;
	 * 
	 * //if(z!=null) { //Compiilation error if(z!=0) { z=x+y; }
	 * 
	 * return z;
	 * 
	 * }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = new String("Parth");
		String b = new String("Parth");

		System.out.println("HashCode of a: " + a.hashCode());
		System.out.println("HashCode of b: " + b.hashCode());

		Integer a1 = 0;
		Integer a2 = 0;

		System.out.println("HashCode of a1: " + a1.hashCode());
		System.out.println("HashCode of a2: " + a2.hashCode());

		Employee e1 = new Employee();
		// e1.hashCode();
		e1.setId(1);
		e1.setName("Parth");

		System.out.println(e1.hashCode());

		Employee e2 = new Employee();
		// e2.hashCode();
		e2.setId(1);
		e2.setName("Parth");
		System.out.println(e2.hashCode());
		
		
		System.out.println(e1.equals(e2));
		

		// @SuppressWarnings("unused")
		// A a=new A(5);
		// a.run();

		/*
		 * MethodCheck m=new MethodCheck(); m.addCheck(1,2);
		 * 
		 * String name="Parth"; Object x=name;
		 * 
		 * System.out.println(x);
		 * 
		 * 
		 * 
		 * Object y="Parth"; String str=(String) y;
		 * 
		 * System.out.println(str);
		 * 
		 * 
		 * ArrayList<Integer> ls=new ArrayList<Integer>(); ls.add(1); ls.add(2);
		 * ls.add(3); System.out.println(ls);
		 * 
		 * Collections.rotate(ls, 2); System.out.println(ls);
		 * 
		 * Employee e1=new Employee(); e1.setId(1); e1.setName("Parth");
		 * 
		 * e1.setId(1); e1.setName("Vaibhav");
		 * 
		 * Employee e2=new Employee(); e2.setId(1); e2.setName("Vaibhav");
		 * 
		 * HashSet<Employee> hs=new HashSet<Employee>(); hs.add(e1);
		 * 
		 * System.out.println(hs);
		 */

		
	}

}
