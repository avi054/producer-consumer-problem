package com.java.solution;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private BlockingQueue<Employee> obj;

	public Consumer(BlockingQueue<Employee> obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Employee employee = obj.take();
					System.out.println("fast Consumer :" + employee);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
