package com.java.Utils.stringutils;

import org.apache.commons.lang3.StringUtils;

public class DemoStringUtils {
    public static void main(String[] args) {

        printOutput("isAlpha", StringUtils.isAlpha("123"));
        System.out.println("isAllBlank : " + StringUtils.isAllBlank(" "));
        System.out.println("isAllEmpty : " + StringUtils.isAllEmpty("123"));
        System.out.println("isAlphanumeric : " + StringUtils.isAlphanumeric("asd"));
        System.out.println("isAnyEmpty : " + StringUtils.isAnyEmpty("123"));
        System.out.println("isNotEmpty : " + StringUtils.isNotEmpty("123"));
        System.out.println("isEmpty : " + StringUtils.isEmpty("123"));
    }

    private static void printOutput(String name, Object obj) {
        System.out.printf("method used : %s =  %s", name, obj + "\n");
    }

}
