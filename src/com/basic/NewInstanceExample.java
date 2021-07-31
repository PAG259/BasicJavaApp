package com.basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewInstanceExample  
{  
String str="hello";  
public static void main(String args[])  
{  
try  
{  
//creating object of class  
NewInstanceExample obj= NewInstanceExample.class.newInstance();   
System.out.println(obj.str);          
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  

Integer[] a= {1,2,3};
System.out.println(Arrays.asList(a));

@SuppressWarnings("unused")
List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");

ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(a));
for (Integer integer : al) {
	System.out.println(integer);
}



}  
}  
