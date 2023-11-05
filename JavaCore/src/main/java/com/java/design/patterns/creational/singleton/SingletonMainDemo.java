package com.java.design.patterns.creational.singleton;

public class SingletonMainDemo {
    public static void main(String[] args) {
        SingletonMultiThreaded singletonMultiThreaded = SingletonMultiThreaded.getInstance("Single");
    }
}
