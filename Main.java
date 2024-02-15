package com.bridgelabz13;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
				System.out.println(hm);
				System.out.println("*************");
				HashMap<Integer,String> map=new HashMap<Integer,String>();
				map.put(4, "D");
				map.putAll(hm);
				for(Map.Entry m:map.entrySet()) {
					System.out.println(m.getKey()+" "+m.getValue());
							
				}

	}

}
