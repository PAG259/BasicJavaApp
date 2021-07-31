package com.basic;

import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> treeSet=new TreeSet<String>();
		
		treeSet.add("Geeks");
		treeSet.add("for");
		treeSet.add("and");
		
		//Collections.rotate((List<?>) treeSet, 2);
		
		//treeSet.add("Geeks for Geeks");
		
		//System.out.println(treeSet);
		
		for(String temp: treeSet) {
			System.out.println(temp);
		}
	

	}

}
