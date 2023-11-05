package com.java.inner.classes;

public class tryfinallyDemo {
    //we can use try block without specifying catch block with finally
    //if try directly returns control will pass to finally block after going thru end of try block
    public static void main(String[] args) {
        try {
            System.out.println("1");
            return;

            //System.exit(0);
        } finally {
            System.out.println("2");
            System.out.println("finally Block");
            System.out.println("3");
        }
    }

}
