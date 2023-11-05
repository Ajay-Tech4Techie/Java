package com.java.thread.demo;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//this is shared resource 
class SharedObj {
    //The Java volatile keyword is used to mark a Java variable as "being stored in main memory
    //that every read of a volatile variable will be read from the computer's main memory, and not from the CPU cache,
    // and that every write to a volatile variable will be written to main memory, and not just to the CPU cache.
    // Actually, since Java 5 the volatile keyword guarantees more than just that volatile variables are written to and read from main memory.
    volatile int info;

    public synchronized int getI() {
        return info;
    }

    public synchronized void setI(int info) {
        this.info = info;
    }
}


class Producer1 implements Runnable {
    SharedObj sharedObj = new SharedObj();

    public Producer1(SharedObj sharedObj) {
        this.sharedObj = sharedObj;
    }

    public SharedObj getSharedObj() {
        return sharedObj;
    }

    public void setSharedObj(SharedObj sharedObj) {
        this.sharedObj = sharedObj;
    }

    @Override
    public void run() {
        int i = 0;

        synchronized (this) {
            while (true) {
                ++i;
                if (i == 10)
                    return;
                System.out.println("Putting value in SharedObj" + i);
                sharedObj.setI(i);
                notify();
                try {
                    wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        }
    }

    // using Blocking Queue
	/*
	private BlockingQueue<SharedObj> queue;


	public Producer1(BlockingQueue<SharedObj> queue) {
		this.queue = queue;
	}


	@Override
	public void run() {

		int i=0;

		while(true)
		{
			++i;
			if(i==20)
			return;

			SharedObj sobj = new SharedObj();
			sobj.setI(i);
			try {
				System.out.println("producing....."+i);
				 Thread.sleep(100);
				queue.put(sobj);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}*/

}

class Consumer1 implements Runnable {

    Producer1 producer;

    public Consumer1(Producer1 producer) {
        this.producer = producer;
    }

    @Override
    public void run() {

        synchronized (producer) {


            while (true) {
                System.out.println("Consuming the content " + producer.getSharedObj().getI());
                producer.notify();
                if (producer.getSharedObj().getI() == 9) {
                    return;
                }
                try {
                    producer.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

	/*private BlockingQueue<SharedObj> queue;

	public Consumer1(BlockingQueue<SharedObj> queue)
	{
		this.queue = queue;
	}

	@Override
	public void run() {

		SharedObj sobj;

		while(true)
		{
			try {
				if(queue.take().getI()==19)
					return;
				 Thread.sleep(100);
				 System.out.println("Consumed "+queue.take().getI());

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
	 */


}

public class ProducerConsumerTest {
    public static void main(String[] args) {

        Producer1 producer = new Producer1(new SharedObj());
        Consumer1 consumer = new Consumer1(producer);

        Thread producerThread = new Thread(producer);
        Thread conThread = new Thread(consumer);

        producerThread.start();
        conThread.start();
		/*	   
		   //Creating BlockingQueue of size 10
	        BlockingQueue<SharedObj> queue = new ArrayBlockingQueue<SharedObj>(20);
	        Producer1 producer = new Producer1(queue);
	        Consumer1 consumer = new Consumer1(queue);
	        //starting producer to produce messages in queue
	        new Thread(producer).start();
	        //starting consumer to consume messages from queue
	        new Thread(consumer).start();*/
        System.out.println("Producer and Consumer has been started");


    }
}
