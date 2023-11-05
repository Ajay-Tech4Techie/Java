package com.java.core.core.java;

public class StringDemo {
    public static void main(String[] arg) {
        String str1 = "Vijay";
        String str2 = new String("Vijay");
        String str3 = new String("Singh");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());

        System.out.println(str1 == str2.intern());
        System.out.println(str1.equals(str2));

        StringBuffer str = new StringBuffer("Vijay");
        str.append(" Singh");
        System.out.print(str.toString());
    }

}
