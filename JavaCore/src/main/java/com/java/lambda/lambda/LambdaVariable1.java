package com.java.lambda.lambda;

import java.util.function.Consumer;

public class LambdaVariable1 {


    public static void main(String[] args) {

        int i = 0; //Repeated varibale name not allowed
        //Consumer<Integer> c1 = (i) -> {
        Consumer<Integer> c1 = (a) -> {
            //int i=0;
            System.out.println(i);
        };

    }
}
