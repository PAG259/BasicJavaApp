package com.basic;

public class Hi implements Runnable {

	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
