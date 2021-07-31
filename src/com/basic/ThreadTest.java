package com.basic;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread t1=new Thread(()->{
			
			for(int i=1;i<=5;i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		Thread t2=new Thread(()-> {
			
			for(int i=1;i<=5;i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	});
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		Thread.sleep(10);
		t2.start();
		
	}

}
