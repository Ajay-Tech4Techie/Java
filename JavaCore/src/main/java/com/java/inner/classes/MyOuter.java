package com.java.inner.classes;

public class MyOuter {
    public class MyInner {
        public String getMsg() {
            return "Inner method";
        }


    }

    public static void main(String[] a) {

        MyOuter myOuter = new MyOuter();
        MyInner myInner = myOuter.new MyInner();//creating Inner class Instance only


    }
}
