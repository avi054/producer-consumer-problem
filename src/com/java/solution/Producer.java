package com.java.solution;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private BlockingQueue<Employee> obj;

	public Producer(BlockingQueue<Employee> obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			try {
				obj.put(new Employee(i, "name", 101, 201));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
