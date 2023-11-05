package com.java.collection.custom;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
    //array of objects
    private Object[] myElement;
    private int actualSize = 0;

    public MyArrayList() {
        this.myElement = new Object[10];
    }

    public Object get(int index) {
        if (index < actualSize) {
            return myElement[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void add(Object obj) {
        //0 - 0 <=5
        int myElementLengh = myElement.length;
        if (myElementLengh - actualSize <= 5) {
            increaseListSize();
        }
        myElement[actualSize++] = obj;
    }

    private void increaseListSize() {
        myElement = Arrays.copyOf(myElement, myElement.length * 2);
        System.out.println("\n New length " + myElement.length);
    }

    public int size() {
        return actualSize;
    }

    public static void main(String a[]) {
        MyArrayList mal = new MyArrayList();
        ArrayList al = new ArrayList();
        mal.add(new Integer(2));
        mal.add(new Integer(5));
        mal.add(new Integer(1));
        mal.add(new Integer(23));
        mal.add(new Integer(14));
        for (int i = 0; i < mal.size(); i++) {
            System.out.print(mal.get(i) + " ");
        }
        mal.add(new Integer(29));
        System.out.println("Element at Index 5:" + mal.get(5));
        System.out.println("List size: " + mal.size());

    }

}
