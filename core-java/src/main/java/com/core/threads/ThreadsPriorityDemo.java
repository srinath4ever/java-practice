package com.core.threads;

public class ThreadsPriorityDemo {
	
	static public void main(String[] args) throws Exception {
		
		Thread th1 = new MyThr3("thread one");
		Thread th2 = new MyThr3("thread two");
		Thread th3 = new MyThr3("thread three");

		th2.setPriority(Thread.MAX_PRIORITY);
		th1.setPriority(Thread.MIN_PRIORITY);
		th3.setPriority(Thread.NORM_PRIORITY);

		th1.start();
		th2.start();
		th3.start();
	}
}

class MyThr3 extends Thread {
	public MyThr3(String name) {
		setName(name);
	}

	public void run() {
		System.out.println(getName());
		try {
			//can use methods directly since it's extending Thread class
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
