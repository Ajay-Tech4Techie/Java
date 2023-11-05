package com.java.core.core.java;

import com.java.design.patterns.creational.builder.BuilderPattern;
import com.java.design.patterns.creational.singleton.SingletonPlain;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        //TelescopePattern telescopePattern=new TelescopePattern(12, 24);
        //System.out.println("Telescope Pattern "+telescopePattern);

        BuilderPattern cocaCola = new BuilderPattern.Builder(12, 23).calories(99).build();

        System.out.println("cocaCola " + cocaCola);

        ConcurrentLRUCache<String, String> concurrentLRUCache = new ConcurrentLRUCache<String, String>(4);

        concurrentLRUCache.put("a", "Apple");
        concurrentLRUCache.put("b", "boy");
        concurrentLRUCache.put("c", "cat");
        concurrentLRUCache.put("d", "dog");
        concurrentLRUCache.put("e", "Elephant");

        System.out.println("Cache " + concurrentLRUCache.get("b"));


        SingletonPlain singleObj = SingletonPlain.getInstance();


        singleObj.setName("Vijay");

        System.out.println("  " + singleObj.getName());


        SingletonPlain singleObj1 = SingletonPlain.getInstance();

        singleObj.setName("Vijay1");
        System.out.println("  " + singleObj1.getName());
        System.out.println("  " + singleObj1.hashCode());

        singleObj.setName("Vijay2");
        System.out.println("  " + singleObj1.getName());
        SingletonPlain singleObj2 = SingletonPlain.getInstance();
        System.out.println("  " + singleObj2.hashCode());

        singleObj.setName("Vijay3");
        System.out.println("  " + singleObj1.getName());
        SingletonPlain singleObj3 = SingletonPlain.getInstance();
        System.out.println("  " + singleObj3.hashCode());


        System.out.println(" again singleton1 " + singleObj1.getName());

        SingletonPlain singletonClone1 = (SingletonPlain) singleObj.clone();
        singletonClone1.setName("Clone Name");

        System.out.println("Clone Object " + singletonClone1.getName());
        System.out.println("Clone Object hashCode " + singletonClone1.hashCode());

        System.out.println(singleObj1 == singleObj2);
        System.out.println(singleObj2 == singleObj3);
        System.out.println(singleObj3 == singleObj1);

        Method[] methods = SingletonPlain.class.getMethods();

        Class aclass = SingletonPlain.class;
        System.out.println("get Package " + aclass.getPackage());
        System.out.println("get Super Class " + aclass.getSuperclass());
        System.out.println("Class Name " + aclass.getSimpleName());
        Constructor[] constructors = aclass.getConstructors();

        System.out.println("constructor size " + constructors.length);

        for (Constructor con : constructors) {
            System.out.println("all Constructors " + con.getParameterTypes());
        }
        System.out.println("constructors " + constructors);


        Field[] feilds = aclass.getFields();
        for (Field fld : feilds)
            System.out.println("All Fields " + fld);


        for (Method method : methods) {
            System.out.println("method = " + method.getName());
        }


        System.out.println(singleObj1.equals(singletonClone1));


        //String name = new String("Vijay");

        //System.out.println("Reverse String "+reverse(name));

        //System.out.println("is Rotational "+rotation("vijay", "yajiv"));
    }


}
