package com.java.thread.demo;

public class ThreadLocalDemo {

    private static ThreadLocal myThreadLocal = new ThreadLocal();

    public static void main(String[] args) {

        myThreadLocal.set("Vijay");

        System.out.println(myThreadLocal.get());


    }

}
