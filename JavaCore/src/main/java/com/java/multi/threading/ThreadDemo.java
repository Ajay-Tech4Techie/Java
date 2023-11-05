package com.java.multi.threading;

import com.java.multi.threading.threads.ThreadOne;
import com.java.multi.threading.threads.ThreadTwo;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadOne thread1 = new ThreadOne();
        ThreadTwo thread2 = new ThreadTwo();
        thread1.start();
        thread2.start();
    }
}
