package com.basic;

public class TestMap implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abc";
		String s2=s1;
		//System.out.println(s1);
		//System.out.println(s2);
		s2+="d";
		//System.out.println(s2);
		
		System.out.println(s1+" "+s2+" "+(s1==s2));
		
		StringBuffer sbuff1=new StringBuffer("abc");
		StringBuffer sbuff2=sbuff1;
		sbuff2.append("d");
		
		System.out.println(sbuff1+" "+sbuff2+" "+(sbuff1==sbuff2));
		
		Thread t=new Thread();
		t.run();
		t.run();
		t.start();
		
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}

	/*public void run() {
		System.out.println("running");
	}*/
	
}
