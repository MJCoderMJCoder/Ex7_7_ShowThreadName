package com.showthreadname;

class ThreadName extends Thread {
	public ThreadName() {	//���췽��
		super();	//����Thread()
	}
	
	public ThreadName(String name) {	//���췽��
		super(name);	//����Thread(String name)
	}
	
	public void run() {
		System.out.println("����̵߳������ǣ�" + this.getName());
	}
}
