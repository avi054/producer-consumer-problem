//package com.java.solution;
//
//import java.util.concurrent.BlockingQueue;
//
//public class SlowProducer implements Runnable {
//
//	private BlockingQueue<Employee> obj;
//
//	public SlowProducer(BlockingQueue<Employee> obj) {
//		this.obj = obj;
//	}
//
//	@Override
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			try {
//				Thread.sleep(500);
//				System.out.println("slow produced:>> id="+ i);
//				obj.put(new Employee(i, "name", 101, 201));
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//}
