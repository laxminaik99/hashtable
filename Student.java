package com.bridgelabz13;
import java.util.*;

public class Student {
	int id;
	String name,batch,city;
	public Student(int id,String name,String batch,String city) {
		this.id=id;
		this.name=name;
		this.batch=batch;
		this.city=city;
	}

	public static void main(String[] args) {
		Map<Integer,Student> map=new HashMap<Integer,Student>();
		Student ob1=new Student(1,"A","Batch1","Pune");
		Student ob2=new Student(2,"B","Batch2","Mumbai");
		Student ob3=new Student(3,"C","Batch3","Delhi");
		map.put(1, ob1);
		map.put(2, ob2);
		map.put(3, ob3);
		
		for(Map.Entry<Integer,Student> entry:map.entrySet()) {
			int key=entry.getKey();
			Student b=entry.getValue();
			System.out.println(b.id+" "+b.name+" "+b.batch+" "+b.city);
		}
	}

}
