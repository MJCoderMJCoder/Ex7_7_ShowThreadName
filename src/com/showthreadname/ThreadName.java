package com.showthreadname;

class ThreadName extends Thread {
	public ThreadName() {	//构造方法
		super();	//调用Thread()
	}
	
	public ThreadName(String name) {	//构造方法
		super(name);	//调用Thread(String name)
	}
	
	public void run() {
		System.out.println("这个线程的名字是：" + this.getName());
	}
}
