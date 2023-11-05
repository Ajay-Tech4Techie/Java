package com.java.lambda.defaults;

import java.util.List;

/**
 * Created by z001qgd on 7/31/18.
 */
public interface Multiplier {

    int multiply(List<Integer> integerList);

    default int size(List<Integer> integerList) {
        System.out.println("Inside interface");
        return integerList.size();
    }

    static boolean isEmpty(List<Integer> integerList) {

        return integerList != null && integerList.size() == 0;
    }
};
