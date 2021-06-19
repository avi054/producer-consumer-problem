package com.java.solution;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueProdConsumer {
	public static void main(String[] args) {
		//queue with fixed size of 10
		BlockingQueue<Employee> queue = new ArrayBlockingQueue<>(10);
		
		Producer producer = new Producer(queue);//fast producer
//		SlowProducer producer2 = new SlowProducer(queue);
		
		Consumer consumer = new Consumer(queue);
//		SlowConsumer slowConsumer = new SlowConsumer(queue);
		
		Thread producerThread = new Thread(producer);
		
//		Thread slowProducerThread = new Thread(producer2);
		
		Thread consumerThread = new Thread(consumer);
		
//		Thread slowConsumerThread = new Thread(slowConsumer);

		producerThread.start();
		
//		slowProducerThread.start();// slow producer with delay of 5ms
		
		consumerThread.start(); // fast consumer
		
//		slowConsumerThread.start(); // slow consumer with delay of 5ms

	}
}
