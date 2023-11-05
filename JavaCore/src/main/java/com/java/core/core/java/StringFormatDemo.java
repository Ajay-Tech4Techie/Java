package com.java.core.core.java;

public class StringFormatDemo {
    public static final String CONSTANT = "D a update to : %s Comments: %s %s";

    public static void main(String[] args) {
        String var1 =  "";
        String var2 =  "comments ";

        System.out.println(String.format(CONSTANT,var1,var2,null));

        System.out.println(var1.equals(null));

        System.out.println(String.join(", ","My",null,"is","Vijay"));
    }
}
