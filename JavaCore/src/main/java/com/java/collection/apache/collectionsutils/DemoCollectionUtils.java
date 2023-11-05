package com.java.collection.apache.collectionsutils;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.List;

public class DemoCollectionUtils {
    public static void main(String[] args) {


        List<String> list1 = Arrays.asList("One", "Two", "Three","Four");
        List<String> list2 = Arrays.asList("One","Five","Six","Seven");

        System.out.println(" union : " + CollectionUtils.union(list1, list2));
        System.out.println(" intersection : " + CollectionUtils.intersection(list1, list2));
        System.out.println(" disjunction : " + CollectionUtils.disjunction(list1, list2));
        System.out.println(" subtract : " + CollectionUtils.subtract(list1, list2));



    }
}
