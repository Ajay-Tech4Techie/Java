package com.java.core.core.java;

public class MainOverrideDemo {
    public static void main(String[] args) {
        System.out.println("A a = new A(); \n");
        A a = new A();
        a.method1();    //Class A method1
        a.method2();    //Class A method2
        //	a.method3();    //Unresolved compilation problem:

        System.out.println("A a = new B(); \n");

        A b = new B();
        System.out.println(b.method1());    //override's class B method1 to Class B method1
        b.method2();    //Class A method2
        //in order to invoke method3 which is declared in class B we have to type cast b as its having reference of A Object
        //to B class
        ((B) b).method3();    //Unresolved compilation problem:

        System.out.println("B d = new A(); \n");

        B b1 = new B();
        b1.method1();    //override's class B method1 to Class B method1
        b1.method2();    //comes from Class A as it extends class A  method2
        b1.method3();    //Class B method3


        //	B d  = new A(); // here Itself It will give Exception in thread "main" java.lang.Error: Unresolved compilation problem:
        //	d.method1();
        //	d.method2();
        //	d.method3();

    }

}
