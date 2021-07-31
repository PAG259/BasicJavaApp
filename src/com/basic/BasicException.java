package com.basic;

import java.util.ArrayList;

public class BasicException {

	@Override
	public void finalize() {
		System.out.println("Finalize Method called");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")
		ArrayList<? extends Number> ar=new ArrayList<Integer>();
		
		BasicException bs=new BasicException();
		System.out.println(bs);
		bs=null;
		System.out.println(bs);
		
		System.gc();
		
		
		/*try {
			
			int a=5;
			int b=0;
			int c=a/b;
			
		}
		
		catch (Exception e) {
			// TODO: handle exception
			
			throw new Exception("Exception Caught");
			
		}
		
		finally {
			
			System.out.println("Inside Finally Block");
			
		}
		*/

	}

}
