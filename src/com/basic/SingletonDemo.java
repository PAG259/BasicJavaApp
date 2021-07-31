package com.basic;

public class SingletonDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				ABC obj=ABC.getInstance();
				
				System.out.println(obj);
			}
		});
		
		
	/*	ABC obj=ABC.getInstance();	
		System.out.println(obj);*/
		

		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				ABC obj1=ABC.getInstance();
				
				System.out.println(obj1);
			}
		});
		
		t1.start();
		t2.start();
		
	}

}
