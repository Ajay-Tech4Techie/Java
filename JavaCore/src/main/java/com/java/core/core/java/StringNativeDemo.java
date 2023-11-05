package com.java.core.core.java;

public class StringNativeDemo {

    final static public int i = 0;

//	private static final byte TARGET = 0x90; // Broken!


    public static void main(String[] args) {
        String str1 = "vijay";
        String str2 = new String("singh");

        System.out.println("str1==str2 " + str1 == str2);  // false
        System.out.println("str1.equals(str2) " + str1.equals(str2)); // true
        System.out.println("singh" == str2.intern()); //true

        for (int b = Integer.MIN_VALUE; b < Integer.MAX_VALUE; b++) {
            if (b == 126)
                System.out.println("Joy!" + b);
        }

        try {
            NumberRead nr = new NumberRead();
            nr.getMyDrive(1);

        } catch (MyNotZeroException mnze) {
            System.err.println("My Not Zero Exception " + mnze.getMessage());
        }


    }

}
