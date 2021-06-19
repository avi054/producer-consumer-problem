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
				Thread.sleep(3000);
				Employee employee = obj.take();
					System.out.println("Consumed:<< id="+ employee.getId() +" queueSize---->"+ obj.size());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
