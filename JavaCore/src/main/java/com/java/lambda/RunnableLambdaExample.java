package com.java.lambda;

public class RunnableLambdaExample {
    public static void main() {

        //Until Java 7
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();


        //Java 8 Lambda
        Runnable lambdaRunnable = () -> {
            System.out.println("Inside Lamdas");
        };


        //Single statement dont need curly braces

        Runnable lambdaRunnable2 = () -> System.out.print("Inside lambda 2");
        new Thread(lambdaRunnable2).start();


    }
}
