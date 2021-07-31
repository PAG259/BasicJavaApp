package com.basic;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m=Mobile.APPLE;
		System.out.println(m);
		
		@SuppressWarnings("unused")
		Phone p1;
		p1=()-> System.out.println("Hello");
		
		p1.show();
		
		//ClassCastException is run time exception
/*		ArrayList al=new ArrayList();
		al.add("A");
		al.add(5);
		al.add("Parth");
		al.add(10.5);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		*/
		Phone p=new Phone() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("Call");
			}
		};
		
		p.show();
		
	}

}
