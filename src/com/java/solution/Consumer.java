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
				Thread.sleep(1000);
				long start = System.currentTimeMillis();
				Employee employee = obj.take();
				long end = System.currentTimeMillis();
				System.out.println("Waiting for producer: "+ (end-start)/1000 +"sec");
				System.out.println("Consumed:<< id="+ employee.getId() +" queueSize---->"+ obj.size());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
