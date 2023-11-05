package com.java.design.patterns.creational.singleton;

public class SingletonPlain implements Cloneable {

    private static SingletonPlain singleton; //

    private String name;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    private SingletonPlain() {
        System.out.println("Object will be created only once its now created...");
    }

    public static SingletonPlain getInstance() {
        if (singleton == null)
            return singleton = new SingletonPlain();
        else
            return singleton;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}



