package com.showthreadname;
/* 
 * �̵߳�Ĭ������һ���ǡ�Thread-������һ����������
 * �������߳���˵������Ĭ������һ�������Ϊmain
 */
public class ShowThreadName {

	public static void main(String[] args) {
		ThreadName defaultName = new ThreadName();
		ThreadName name = new ThreadName("����");
		defaultName.start();
		name.start();

	}

}
