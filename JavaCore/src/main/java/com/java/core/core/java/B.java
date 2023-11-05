package com.java.core.core.java;

public class B extends A {

    @Override
    public String method1() {
        String name = super.method1();
        //String name2 = "Vijay Singh Chandel";

        System.out.println("Class B overrides method1() in Class B");

        return name.concat("Chandel");
    }

    public void method3() {
        System.out.println("Class B method3");
    }


}
