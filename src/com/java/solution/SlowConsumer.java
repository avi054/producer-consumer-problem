//package com.java.solution;
//
//import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.CompletableFuture;
//
//public class SlowConsumer implements Runnable {
//
//	private BlockingQueue<Employee> obj;
//
//	public SlowConsumer(BlockingQueue<Employee> obj) {
//		this.obj = obj;
//	}
//
//	@Override
//	public void run() {
//		long lastUpdatedTime= System.currentTimeMillis();// to keep last printed timing  
//		while (true) {
//			try {
//				Employee employee = obj.take();
//				Thread.sleep(50);
//				
//				//check for print every 500ms 
//				if (System.currentTimeMillis() - lastUpdatedTime >= 500) {
//					lastUpdatedTime = System.currentTimeMillis();
//					
//					/*
//					 * run execution as seprate thread 
//					 * so current thread executions should not delay
//					 */
//					CompletableFuture.runAsync(()->{
//							System.out.println("slow Consumed :" + employee);
//					});
//
//				}
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//}
