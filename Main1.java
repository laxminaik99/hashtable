package com.bridgelabz13;
import java.util.*;

public class Main1 {

	public static void main(String[] args) {
		Map<Integer,ArrayList<String>> hm=new HashMap<>();
		addArrayList(hm,1,"Pune");
		addArrayList(hm,2,"Mumbai");
		addArrayList(hm,3,"Navi Mumbai");
		displayList(hm);
	}
	
	public static void addArrayList(Map<Integer,ArrayList<String>> hm1,Integer key,String value) {
		ArrayList<String> al1=new ArrayList<>();
		al1.add(value);
		hm1.put(key, al1);
	}
	public static void displayList(Map<Integer,ArrayList<String>> hm1) {
		for(Map.Entry<Integer,ArrayList<String>> entry:hm1.entrySet()) {
			Integer key=entry.getKey();
			ArrayList<String> values=entry.getValue();
			System.out.println("Key: "+key+", Values: "+values);
					
		}
	}
}
