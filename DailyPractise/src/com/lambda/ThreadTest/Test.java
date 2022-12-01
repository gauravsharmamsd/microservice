package com.lambda.ThreadTest;

public class Test {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			int i = 0;
			while (i < 10) {
				System.out.println(Thread.currentThread().getName()+"running thread count " + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				i++;
			}
		};
		Thread thread=new Thread(runnable);
		thread.setName("thread 1");
		thread.start();
	}
}
