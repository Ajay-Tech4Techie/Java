package com.java.core.core.java;

public class ReverseTest {

    public static void main(String[] args) {
        String str = "testing";

        //String str2="";
        char[] ch = str.toCharArray();

        for (int i = ch.length - 1, j = 0; i >= 0; i--, j++) {
            System.out.println(ch[i]);


            //str = str+ch[i];
            ch[j] = ch[i];
        }

        System.out.println(ch);
    }

    public static String reverse(String original) {

        String reverse = new String();

        if (original == null) {
            return original;
        }

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + "" + original.charAt(i);
        }
        return reverse;
    }


}
