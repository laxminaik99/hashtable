package com.bridgelabz13;

class thread_p_4{
	public static synchronized void op(int no) {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(500);
				System.out.println(i*no);
			}catch(Exception e) {
				System.out.println("---------------");
			}
		}
	}
}

class thread_c_4 extends Thread{
	public  void run() {
		thread_p_4.op(6);
			
		}
	}

class thread_c_5 extends Thread{
	public  void run() {
		thread_p_4.op(15);
			
		}
	}


public class static_syncho_thread {

	public static void main(String[] args) {
	thread_c_4 t1=new thread_c_4();	
	t1.start();
	thread_c_5 t2=new thread_c_5();	
	t2.start();
	}

}
