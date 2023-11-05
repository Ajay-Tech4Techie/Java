package com.java.multi.threading.threads;

import java.util.concurrent.TimeUnit;

public class ThreadOne extends Thread{
    @Override
    public void run() {
        final long startTime = System.nanoTime();
        for(int i=0;i<5;i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread takes " +" Seconds to complete: "+ i+" "+this.getName());
        }
        final long endTime = System.nanoTime();
        final long excutionTime = endTime - startTime;
        System.out.println("Thread Excution time is Milliseconds : "+ excutionTime+ " "+this.getName());
    }
}
