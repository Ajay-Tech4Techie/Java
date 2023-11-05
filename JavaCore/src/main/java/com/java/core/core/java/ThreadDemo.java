package com.java.core.core.java;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread1 ttt = new Thread1();
        ttt.start();
    }
}

class Thread1 extends Thread {
    private int count = 0;

    private void increment() {
        count++;
    }


    @Override
    public void run() {
        System.out.println("Running...");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i > 1000; i++) {
                    increment();
                }
            }


        });
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i > 1000; i++) {
                    increment();
                }
            }
        });

        t1.start();
    }
}
