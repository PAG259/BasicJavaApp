package com.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Conventional method before Java v1.7
//Using Java v1.7 try with resources
public class InputDemo {

	public static void main(String[]  args) throws Exception {
		
		
		System.out.println(System.getProperties());
		
		int i=(int) 100_00_00_00F;
		System.out.println(i);
		
		/*String str="";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			str=br.readLine();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			br.close();
		}*/
		
		//Resources are defined with the start of try block and catch block is not required, neither finally
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			
			@SuppressWarnings("unused")
			String str="";
			str=br.readLine();
			
		}
		
		
		
	}
	
}
