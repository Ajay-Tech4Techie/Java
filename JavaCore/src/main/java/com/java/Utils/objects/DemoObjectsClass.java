package com.java.Utils.objects;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Objects;

public class DemoObjectsClass {
    public static void main(String[] args) {

        System.out.println(Objects.isNull(new Object()));
        System.out.println(Objects.nonNull(new Object()));

        ObjectUtils.isEmpty(null);
        ObjectUtils.isNotEmpty(null);
    }
}
