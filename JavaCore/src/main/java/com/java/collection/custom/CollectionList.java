package com.java.collection.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1111111");
        list.add("1111111");
        list.add("2222222");
        list.add("3333333");
        list.add("4444444");
        list.add("4444444");
        list.add("4444444");
        list.add("4444444");


        System.out.println("\nExample 1 - Count 'a' with frequency");
        //this is to get the frequency for a using frequency method of
        System.out.println("a : " + Collections.frequency(list, "a"));

        System.out.println("\nExample 2 - Count all with frequency");
        //As set will not take duplicate values hence it is a uniqueSet
        Set<String> uniqueSet = new HashSet<String>(list);
        for (String temp : uniqueSet) {
            //tells the frequency of each element
            System.out.println(temp + ": " + Collections.frequency(list, temp));
        }

        System.out.println("\nExample 3 - Count all with Map");
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String temp : list) {
            Integer count = map.get(temp);
            //System.out.println("Count "+count +"temp  : "+temp);
            map.put(temp, (count == null) ? 1 : count + 1);
        }
        printMap(map);

        System.out.println("\nSorted Map");
        Map<String, Integer> treeMap = new TreeMap<String, Integer>(map);
        printMap(treeMap);


    }

    public static void printMap(Map<String, Integer> map) {

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : "
                    + entry.getValue());
        }

    }

}

