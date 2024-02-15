package com.bridgelabz13;
import java.util.*;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<String,Integer> hashtable=new Hashtable<>();
		hashtable.put("Pune", 1);
		hashtable.put("Delhi", 2);
		hashtable.put("Mumbai", 3);
		
		int a=hashtable.get("Pune");
		System.out.println("Value of a: "+a);
		
		hashtable.remove("Delhi");
		
		Enumeration<String> e=hashtable.keys();
		while(e.hasMoreElements()) {
			String key=e.nextElement();
			System.out.println("Key: "+key+", Values: "+hashtable.get(key));
			}
	}

}
