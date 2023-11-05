package com.java.multi.threading.threads;

public class ThreadTwo extends Thread{
    @Override
    public void run() {
        System.out.println("Thread "+this.getName());
    }
}

