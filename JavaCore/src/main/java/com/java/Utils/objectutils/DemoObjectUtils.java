package com.java.Utils.objectutils;

import org.apache.commons.lang3.ObjectUtils;

public class DemoObjectUtils {
    public static void main(String[] args) {
        System.out.println(ObjectUtils.isEmpty("ss"));
        System.out.println(ObjectUtils.isNotEmpty("ss"));
        System.out.println(ObjectUtils.notEqual(new Object(),new Object()));
        System.out.println(ObjectUtils.defaultIfNull(null,"default"));
    }
}
