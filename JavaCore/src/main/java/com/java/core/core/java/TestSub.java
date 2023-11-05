package com.java.core.core.java;

import com.java.design.patterns.creational.singleton.SingletonPlain;

public class TestSub {
    public static void main(String agr[]) {
		/*TestSub sub=new TestSub();
		System.out.println("Super class member "+sub.number);*/


        SingletonPlain s = SingletonPlain.getInstance();
        System.out.println("" + s.hashCode());

        SingletonPlain s5 = SingletonPlain.getInstance();
        System.out.println("" + s5.hashCode());

        System.out.println(s == s5);

        try {
            SingletonPlain s2 = (SingletonPlain) s.clone();

            System.out.println(s == s2);

            System.out.println("" + s2.hashCode());

            SingletonPlain s3 = (SingletonPlain) s.clone();
            System.out.println("" + s3.hashCode());

            SingletonPlain s4 = (SingletonPlain) s.clone();
            System.out.println("" + s4.hashCode());

        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
