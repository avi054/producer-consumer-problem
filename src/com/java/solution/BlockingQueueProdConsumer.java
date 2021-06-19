package com.java.solution;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueProdConsumer {
	public static void main(String[] args) {
		//queue with fixed size of 10
		BlockingQueue<Employee> queue = new ArrayBlockingQueue<>(10);
		
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);

		producerThread.start();
		consumerThread.start();
	}
}
