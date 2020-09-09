package com.core.threads;

class DaemonThreadDemo {
	public static void main(String[] args) {
		DaemonThread d = new DaemonThread();
		Thread t = new Thread(d);
		t.setDaemon(true);
		t.start();
		System.out.println("ExitingMain");
	}
}
