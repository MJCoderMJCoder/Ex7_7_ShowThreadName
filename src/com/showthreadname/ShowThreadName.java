package com.showthreadname;
/* 
 * 线程的默认名字一般是“Thread-”加上一个递增的数
 * 对于主线程来说，它的默认名字一般会设置为main
 */
public class ShowThreadName {

	public static void main(String[] args) {
		ThreadName defaultName = new ThreadName();
		ThreadName name = new ThreadName("如来");
		defaultName.start();
		name.start();

	}

}
